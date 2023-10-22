class NewPrinterAdapter implements Printer {
    private NewPrinter newPrinter;

    public NewPrinterAdapter(NewPrinter newPrinter) {
        this.newPrinter = newPrinter;
    }

    @Override
    public void printDocument(String document) {
        newPrinter.print(document);
    }
}
