/**
 * Task 427: payment method overriding.
 */
public class Task427PaymentOverride {
    static class Payment {
        void process() { System.out.println("Processing the payment."); }
    }

    static class CashPayment extends Payment {
    }

    static class CardPayment extends Payment {
        @Override
        void process() { System.out.println("Processing payment from card."); }
    }

    static class PayPalPayment extends Payment {
        @Override
        void process() { System.out.println("Processing payment from PayPal."); }
    }

    // Runs the Task 427 demonstration.
    public static void main(String[] args) {
        new CashPayment().process();
        new CardPayment().process();
        new PayPalPayment().process();
    }
}
