/**
 * Task 426: payment inheritance.
 */
public class Task426PaymentInheritance {
    static class Payment {
        void process() { System.out.println("Processing the payment."); }
    }

    static class CashPayment extends Payment {
    }

    public static void main(String[] args) {
        CashPayment cashPayment = new CashPayment();
        cashPayment.process();
    }
}
