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

    public static void main(String[] args) {
        System.out.println("Task 428 object model is ready.");
    }
}
