package l3classesobjects.printerchallenge;

public class Printer {
    // variables
    private int tonerLevel;
    private int pagesPrinterNumber;
    private boolean isDublex;

    // constructors
    public Printer(int tonerLevel, boolean isDublex) {
        this.tonerLevel = tonerLevel;
        this.isDublex = isDublex;
        this.pagesPrinterNumber = 0;
    }

    public Printer(boolean isDublex) {
        this.isDublex = isDublex;
        this.pagesPrinterNumber = 0;
    }

    // custom methods
    public int fillUpToner(int addedTonerAmount) {
        if (this.tonerLevel > -1 && this.tonerLevel < 100) {
            if (this.tonerLevel + addedTonerAmount < 100) {
                this.tonerLevel += addedTonerAmount;
            } else {
                System.out.println("Wrong input!");
            }
        } else {
            System.out.println("Wrong input!");
        }
        return this.tonerLevel;
    }

    // method signature (metod imzası)
    public int calcPrintedPages(int pagesPrinted, boolean isDublex) {
        if(isDublex){
            this.pagesPrinterNumber += pagesPrinted/2 + pagesPrinted%2;
            this.tonerLevel -= pagesPrinterNumber * 2;
        } else {
            this.pagesPrinterNumber += pagesPrinted;
            this.tonerLevel -= pagesPrinterNumber;
        }
        return this.pagesPrinterNumber;
    }


    // getter & setter

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getPagesPrinterNumber() {
        return pagesPrinterNumber;
    }

    public boolean isDublex() {
        return isDublex;
    }

    public void setDublex(boolean dublex) {
        isDublex = dublex;
    }


    // toString & hashCode & equals

}
