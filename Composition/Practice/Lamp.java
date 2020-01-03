package OOP.Composition.Practice;

public class Lamp {

    private int rating;
    private boolean automatic;

    public Lamp(int rating, boolean automatic) {
        this.rating = rating;
        this.automatic = automatic;
    }

    public void lightUp(){
        System.out.println("Lamp is on");
    }

    public int getRating() {
        return rating;
    }

    public boolean isAutomatic() {
        return automatic;
    }
}
