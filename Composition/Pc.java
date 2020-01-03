package OOP.Composition;

public class Pc {

    private Monitor monitor;
    private Case theCase;
    private MotherBoard motherBoard;

    public Pc(Monitor monitor, Case theCase, MotherBoard motherBoard) {
        this.monitor = monitor;
        this.theCase = theCase;
        this.motherBoard = motherBoard;
    }

    public void bootUp(){

      startUp();


    }

    private void startUp(){

        theCase.powerButton();
        motherBoard.startUp("window 10");
        monitor.drawAtScreen(2,5,"red");

    }


}
