package homework6;

public class Main {
    public static void main(String[] args) {
        FlowerStore flowerStore = new FlowerStore();
        Flower[] flowers1 = flowerStore.sell(4, 5, 2);
        Flower[] flowers2 = flowerStore.sellSequence(4, 5, 2);

        for (int i = 0; i < flowers1.length; i++) {
            System.out.print(flowers1[i].toString());
            if (i < flowers1.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.println();
        for (int i = 0; i < flowers2.length; i++) {
            System.out.print(flowers2[i].toString());
            if (i < flowers2.length - 1) {
                System.out.print(", ");
            }
        }
    }
}
