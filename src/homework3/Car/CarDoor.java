package homework3.Car;

public class CarDoor {
    private boolean isOpen;
    private boolean isOpenWindow;


    public CarDoor() {
        isOpen = false;
        isOpenWindow = false;
    }

    public CarDoor(boolean isOpen, boolean isOpenWindow) {
        this.isOpen = isOpen;
        this.isOpenWindow = isOpenWindow;
    }
}
