package solidforclass.openclose;

public class PrintInvoicePDF implements InvoicePrinter{
    @Override
    public void print() {
        System.out.println("pdf format printing....");
    }
}
