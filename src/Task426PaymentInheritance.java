public class Task426PaymentInheritance {
    static class Payment {
        void process() { System.out.println("Processing the payment."); }
    }

    static class CashPayment extends Payment {
    }

    public static void main(String[] args) {
        System.out.println("Task 426 object model is ready.");
    }
}
