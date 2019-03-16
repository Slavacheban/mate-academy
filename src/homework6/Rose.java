package homework6;

public class Rose extends Flower {
    private int price;

    public Rose(int price) {
        super(price);
    }

    @Override
    public String toString() {
        return "Rose";
    }

    @Override
    public int getPrice() {
        return price;
    }
}
