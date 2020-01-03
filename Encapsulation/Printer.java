package OOP.Encapsulation;

public class Printer {

    private int tonerLevel;

    private boolean isDuplex;

    private  int pages;

    public Printer(int tonerLevel, boolean isDuplex) {

        if (tonerLevel >= 0 && tonerLevel <= 100){
            this.tonerLevel = tonerLevel;
        } else
        {
            System.out.println("Invalid toner amount:");
        }


        this.isDuplex = isDuplex;
    }


    public void fillToner(int amount){
        tonerLevel += amount;
        if (tonerLevel >= 0 && tonerLevel < 100){
            System.out.println("toner is filled up. after filling toner amount is " + tonerLevel);
        } else {
            System.out.println("Toner is over filled");
            tonerLevel -= amount;
        }
    }


    public void printedPages(int pagesPrinted, boolean isDuplex){
         int num = 0;
        if (isDuplex){
            num +=  pagesPrinted / 2;
            pages += num;
            System.out.println("In duplex mode.pages to print " + pagesPrinted +" printer has printed " + num + " pages. Total: " + pages);
        } else
        {
            num +=pagesPrinted;
            pages += num;
            System.out.println("In single mode.pages to print "  + pagesPrinted + " printer has printed " + num + " pages.Total: " + pages);
        }

    }











}
