package OOP.Encapsulation;

public class Main {

    public static void main(String[] args) {

        Printer  printer = new Printer(25,true);
        printer.fillToner(70);
        printer.printedPages(60,true);
        printer.printedPages(20,false);
        printer.printedPages(8,true);
    }

}
