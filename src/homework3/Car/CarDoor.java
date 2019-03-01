package homework3.Car;

public class CarDoor {
    private boolean isOpen;
    private boolean isOpenWindow;


    public CarDoor() {

    }

    public CarDoor(boolean isOpen, boolean isOpenWindow) {
        this.isOpen = isOpen;
        this.isOpenWindow = isOpenWindow;
    }

    public void openDoor() {
        isOpen = true;
    }

    public void openWindow() {
        isOpenWindow = true;
    }

    public void closeDoor() {
        isOpen = false;
    }

    public void closeWindow() {
        isOpenWindow = false;
    }

    public void changeDoor() {
        isOpen = !isOpen;
    }

    public void chengeWindow() {
        isOpenWindow = !isOpenWindow;
    }

    public void printConditionCar() {
        System.out.println("Car door is " + ((isOpen) ? "Open" : "Close") +
                ": car window" + ((isOpenWindow) ? "Open" : "Close"));
    }
}
