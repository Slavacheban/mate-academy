package homework3.Car;

public class CarWheel {
    private double conditionOfWheel;

    public CarWheel() {
    }

    public CarWheel(double conditionOfWheel) {
        this.conditionOfWheel = conditionOfWheel;
    }

    public double getConditionOfWheel() {
        return conditionOfWheel;
    }

    public void updateWheel() {
        conditionOfWheel = 1;
    }

    public void tiredWheel(double interest) {
        conditionOfWheel = (conditionOfWheel > interest/100)? (conditionOfWheel - interest/100) : 0;
    }

    public void printCondition() {
        System.out.println("Шины стерты на " + (100 - conditionOfWheel*100) + "%");
    }
}
