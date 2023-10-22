class OldPrinterAdapter implements Printer {
    private final OldPrinter oldPrinter;

    public OldPrinterAdapter(OldPrinter oldPrinter) {
        this.oldPrinter = oldPrinter;
    }

    @Override
    public void printDocument(String document) {
        oldPrinter.printDocument(document);
    }
}
