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

    public void OpenDoor() {
        isOpen = true;
    }

    public void OpenWindow() {
        isOpenWindow = true;
    }

    public void CloseDoor() {
        isOpen = false;
    }

    public void CloseWindow() {
        isOpenWindow = false;
    }

    public void ChangeDoor() {
        isOpen = (!isOpen);
    }

    public void ChengeWindow() {
        isOpenWindow = (!isOpenWindow);
    }

    public void printConditionCar() {
        System.out.println("Car door is " + ((isOpen) ? "Open" : "Close") +
                ": car window" + ((isOpenWindow) ? "Open" : "Close"));
    }
}
