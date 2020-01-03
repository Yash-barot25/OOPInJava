package OOP.Composition.Practice;

public class Bed {

    private int pilos;
    private int height;
    private int width;

    public Bed(int pilos, int height, int width) {
        this.pilos = pilos;
        this.height = height;
        this.width = width;
    }

    public void make(){
        System.out.println("Making -> Bed");
    }

    public int getPilos() {
        return pilos;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }
}
