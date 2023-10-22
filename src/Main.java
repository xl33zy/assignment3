public class Main {
    public static void main(String[] args) {
        Printer printer1 = new OldPrinterAdapter(new OldPrinter());
        Printer printer2 = new NewPrinterAdapter(new NewPrinter());

        printer1.printDocument("Документ 1 (старый принтер)");
        printer2.printDocument("Документ 2 (новый принтер)");
    }
}
