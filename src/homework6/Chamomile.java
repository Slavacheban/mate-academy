package homework6;

public class Chamomile extends Flower {
    private int price;

    public Chamomile(int price) {
        super(price);
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Chamomile";
    }
}
