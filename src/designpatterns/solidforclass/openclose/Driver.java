package solidforclass.openclose;

public class Driver {
    public static void main(String[] args) {
        InvoicePrinter pdf = new PrintInvoicePDF();
        pdf.print();
        InvoicePrinter excel = new PrintInvoicExcel();
        excel.print();
    }
}
