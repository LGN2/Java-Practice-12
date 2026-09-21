/**
 * Task 426: payment inheritance.
 */
public class Task426PaymentInheritance {
    static class Payment {
        void process() { System.out.println("Processing the payment."); }
    }

    static class CashPayment extends Payment {
    }

    // Runs the Task 426 demonstration.
    public static void main(String[] args) {
        CashPayment cashPayment = new CashPayment();
        cashPayment.process();
    }
}

// Task 426 is complete and follows Java naming conventions.
