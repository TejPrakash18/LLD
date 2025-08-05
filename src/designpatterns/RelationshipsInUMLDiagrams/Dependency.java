package RelationshipsInUMLDiagrams;



class PaymentService {
    void processPayment(String paymentType) {
        System.out.println("Processing " + paymentType + " payment");
    }
}

class Customer {
    void makePayment(PaymentService service, String paymentType) {
        service.processPayment(paymentType); // Dependency
    }
}

public class Dependency {
    public static void main(String[] args) {
        PaymentService service = new PaymentService();
        Customer customer = new Customer();

        customer.makePayment(service, "Credit Card");
    }
}
