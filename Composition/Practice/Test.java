package OOP.Composition.Practice;

public class Test {
    public static void main(String[] args) {


        Wall wall1 = new Wall("north");
        Wall wall2 = new Wall("south");
        Wall wall3 = new Wall("east");
        Wall wall4 = new Wall("west");

Lamp lamp = new Lamp(100,false);

Sealling selling = new Sealling(10,"white");

Bed myBed = new Bed(4,2,4);

BedRoom yashBedRoom = new BedRoom("mybed",wall1,wall2,wall3,wall4,selling,myBed,lamp);
yashBedRoom.lamp();
yashBedRoom.makeBed();




    }
}
