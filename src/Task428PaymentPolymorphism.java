/**
 * Task 428: payment polymorphism.
 */
import java.util.ArrayList;
import java.util.List;

public class Task428PaymentPolymorphism {
    static class Payment {
        void process() { System.out.println("Processing cash payment."); }
    }
    static class CashPayment extends Payment { }
    static class CardPayment extends Payment {
        @Override void process() { System.out.println("Processing card payment."); }
    }
    static class PayPalPayment extends Payment {
        @Override void process() { System.out.println("Processing PayPal payment."); }
    }

    // Runs the Task 428 demonstration.
    public static void main(String[] args) {
        List<Payment> payments = new ArrayList<>();
        payments.add(new CashPayment());
        payments.add(new CardPayment());
        payments.add(new PayPalPayment());
        for (Payment payment : payments) payment.process();
    }
}

// Task 428 is complete and follows Java naming conventions.
