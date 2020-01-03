package OOP.Composition;

public class MotherBoard {

    private String model;
    private String manufacturer;
    private int cardSlot;
    private int ramSlot;

    public MotherBoard(String model, String manufacturer, int cardSlot, int ramSlot) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.cardSlot = cardSlot;
        this.ramSlot = ramSlot;
    }

    public void startUp(String program){
        System.out.println("PC is loading " + program + " program.");
    }



    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getCardSlot() {
        return cardSlot;
    }

    public int getRamSlot() {
        return ramSlot;
    }
}
