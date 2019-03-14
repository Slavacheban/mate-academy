package homework6;

public class Tulip extends Flower {
    private int price;

    public Tulip(int price) {
        super(price);
    }

    @Override
    public String toString() {
        return "Tulip";
    }

    @Override
    public int getPrice() {
        return price;
    }
}
