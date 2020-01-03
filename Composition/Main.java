package OOP.Composition;

public class Main {

    public static void main(String[] args) {

        MotherBoard motherBoard = new MotherBoard("7x005","acer",2,2);

        Monitor monitor = new Monitor("fgs66","lenovo",new Resolution(720,1080));

        Case theCase = new Case("78374","dell",new Dimensions(25,25,40));

        Pc pc = new Pc(monitor,theCase,motherBoard);

      pc.bootUp();







    }
}
