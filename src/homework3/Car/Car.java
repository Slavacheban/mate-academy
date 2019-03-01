package homework3.Car;

public class Car {
    private final String dateOfBurn;
    private String typeOfEngine;
    private int maxSpeed;
    private int timeOf100km;
    private int peopleCapacity;
    private int hasPeople;
    private int currentSpeed;
    private CarWheel[] allWheel;
    private CarDoor[] allDoor;

    public Car(String dateOfBurn) {
        this.dateOfBurn = dateOfBurn;
    }

    public Car(String dateOfBurn, String typeOfEngine, int maxSpeed, int timeOf100km, int peopleCapacity, int hasPeople, int currentSpeed) {
        this.dateOfBurn = dateOfBurn;
        this.typeOfEngine = typeOfEngine;
        this.maxSpeed = maxSpeed;
        this.timeOf100km = timeOf100km;
        this.peopleCapacity = peopleCapacity;
        this.hasPeople = hasPeople;
        this.currentSpeed = currentSpeed;
    }

    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public void addOnePeople() {
        if (peopleCapacity != hasPeople) hasPeople++;
    }

    public void minusOnePeaole() {
        if (hasPeople != 0) hasPeople--;
    }

    public void allInPEople() {
        hasPeople = 0;
    }

    public CarDoor getCarDoor(int i) {
        try {
            return allDoor[i];
        }
        catch (Exception e) {
            System.out.println("Нет такой двери");
            return null;
        }
    }

    public void removeAllWheel() {
        allWheel = new CarWheel[0];
    }

    public void addNewWheel(int n) {
        CarWheel[] carWheels = allWheel;
        allWheel = new CarWheel[carWheels.length + n];
        for (int i = 0; i < carWheels.length; i++) {
            allWheel[i] = carWheels[i];
        }
        for (int i = carWheels.length; i < allWheel.length ; i++) {
            allWheel[i] = new CarWheel();
        }
    }

    public int carrentMaxSpeed() {
        if(hasPeople ==0) return 0;
        else {
            double min = allWheel[0].getConditionOfWheel();
            for (int i = 1; i < allWheel.length; i++) {
                if (allWheel[i].getConditionOfWheel() < min) {
                    min = allWheel[i].getConditionOfWheel();
                }
            }
            return (int) (maxSpeed * min);
        }
    }

    public void printCarrentConditionOfCar() {
        System.out.println("Car is " + dateOfBurn);
        System.out.println("typeOfEngine " + typeOfEngine);
        System.out.println("MaxSpeed is "  +maxSpeed);
        System.out.println("current max speed is " + carrentMaxSpeed());
        System.out.println("There are "  + hasPeople + " of people");
    }

}
