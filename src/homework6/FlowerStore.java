package homework6;

import java.util.*;


public class FlowerStore {
    private int wallet;

    public int getWallet() {
        return wallet;
    }

    public Flower[] sell(int r, int c, int t) {
        Flower[] flowers = new Flower[r + c + t];
        for (int i = 0; i < r; i++) {
            flowers[i] = new Rose(100);
        }
        for (int i = r; i < c + r; i++) {
            flowers[i] = new Chamomile(70);
        }
        for (int i = c + r; i < c + r + t; i++) {
            flowers[i] = new Tulip(45);
        }
        addMoney(flowers);
        return flowers;
    }

    public Flower[] sellSequence(int r, int c, int t) {
        Flower[] flowers = new Flower[r + c + t];
        Queue<Flower> roses = new PriorityQueue<Flower>(Arrays.asList(sell(r, 0, 0)));
        Queue<Flower> chamomiles = new PriorityQueue<Flower>(Arrays.asList(sell(0, c, 0)));
        Queue<Flower> tulips = new PriorityQueue<Flower>(Arrays.asList(sell(0, 0, t)));

        for (int i = 0; i < flowers.length; ) {
            Optional<Flower> flowerR = Optional.ofNullable(roses.poll());
            Optional<Flower> flowerC = Optional.ofNullable(chamomiles.poll());
            Optional<Flower> flowerT = Optional.ofNullable(tulips.poll());
            if (flowerR.isPresent()) {
                flowers[i++] = flowerR.get();
            }
            if (flowerC.isPresent()) {
                flowers[i++] = flowerC.get();
            }
            if (flowerT.isPresent()) {
                flowers[i++] = flowerT.get();
            }
        }
        addMoney(flowers);
        return flowers;
    }

    private void addMoney(Flower... flowers) {
        for (Flower flower : flowers) {
            wallet += flower.getPrice();
        }
    }
}
