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

    public static void main(String[] args) {
        System.out.println("Task 427 object model is ready.");
    }
}
