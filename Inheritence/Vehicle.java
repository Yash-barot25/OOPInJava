package OOP.Inheritence;

public class Vehicle {

    private String name;
    private String size;

    private int currentDirection;
    private int currentVelocity;


    public Vehicle(String name, String size) {
        this.name = name;
        this.size = size;
        this.currentDirection = 0;
        this.currentVelocity = 0;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public void steer(int direction){
        currentDirection += direction;
        System.out.println("vehicle is moving in " +  currentDirection + " degree." );

    }

    public void move(int velocity,int direction){
        currentDirection = direction;
        currentVelocity = velocity;


    }

    public void stop(){
        currentVelocity = 0;
        System.out.println("vehicle is stopped.");
    }

}
