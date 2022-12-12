package l3classesobjects.printerchallenge;

public class TestPrinter {

    public static void main(String[] args) {

        Printer printer = new Printer(20, true);
        System.out.println("Initialized printed page number is : "
                + printer.getPagesPrinterNumber());

        printer.calcPrintedPages(11, true);
        System.out.println("Printed page number : " +
                printer.getPagesPrinterNumber());
        System.out.println("Remained toner level : " + printer.getTonerLevel());

        System.out.println("New toner level after fill up: "
                + printer.fillUpToner(130));

      //  printer.setTonerLevel(130);
        System.out.println("Remained toner level : " + printer.getTonerLevel());

    }

}
