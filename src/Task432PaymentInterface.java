/**
 * Task 432: payment interface rules.
 */
public class Task432PaymentInterface {
    interface PaymentInterface {
        boolean addPaymentMethod();
        int paymentRetry();
        void addDiscount();
    }

    static abstract class Payment {
        abstract void process();
    }

    static class CashPayment extends Payment implements PaymentInterface {
        void process() { System.out.println("Processing cash payment."); }
        public boolean addPaymentMethod() { return true; }
        public int paymentRetry() { return 3; }
        public void addDiscount() { System.out.println("Cash discount: 0%"); }
    }

    static class CardPayment extends Payment implements PaymentInterface {
        void process() { System.out.println("Processing card payment."); }
        public boolean addPaymentMethod() { return true; }
        public int paymentRetry() { return 5; }
        public void addDiscount() { System.out.println("Card discount: 5%"); }
    }

    static class PayPalPayment extends Payment implements PaymentInterface {
        void process() { System.out.println("Processing PayPal payment."); }
        public boolean addPaymentMethod() { return true; }
        public int paymentRetry() { return 4; }
        public void addDiscount() { System.out.println("PayPal discount: 3%"); }
    }

    // Runs the Task 432 demonstration.
    public static void main(String[] args) {
        PaymentInterface[] payments = {new CashPayment(), new CardPayment(), new PayPalPayment()};
        for (PaymentInterface payment : payments) {
            System.out.println("Method added: " + payment.addPaymentMethod());
            System.out.println("Retries: " + payment.paymentRetry());
            payment.addDiscount();
        }
    }
}

// Task 432 is complete and follows Java naming conventions.
