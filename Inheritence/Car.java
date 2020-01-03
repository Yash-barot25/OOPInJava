package OOP.Inheritence;

public class Car extends Vehicle {

    private int doors;
    private int windows;
    private int wheels;
    private int gears;

    private int currentGear;
    public Car(String name, String type, int speed, int doors, int windows, int wheels, int gears) {
        super(name, type);
        this.doors = doors;
        this.windows = windows;
        this.wheels = wheels;
        this.gears = gears;
    }



    public void chageGear(int currentGear) {
        this.currentGear = currentGear;
        System.out.println("gear is changed. current gear is " + this.currentGear);

    }

    public void changeVelocity(int velocity,int direction){
        move(velocity,direction);
        System.out.println("velocity is changed. car is moving at speed of " + getCurrentVelocity()+ "km/h" + " in " + getCurrentDirection() + " degree");

    }
}
