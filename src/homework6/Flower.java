package homework6;

public abstract class Flower {
    private int price;

    public Flower(int price) {
        this.price = price;
    }

    public abstract int getPrice();
}
