import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task431PaymentMenu {
    static abstract class Payment {
        abstract void process();
    }
    static class CashPayment extends Payment {
        void process() { System.out.println("Processing cash payment."); }
    }
    static class CardPayment extends Payment {
        void process() { System.out.println("Processing card payment."); }
    }
    static class PayPalPayment extends Payment {
        void process() { System.out.println("Processing PayPal payment."); }
    }

    public static void main(String[] args) {
        System.out.println("Task 431 object model is ready.");
    }

    static void printMenu() {
        System.out.println("\n1. Cash\n2. Card\n3. PayPal\n4. Print all payments\n5. Exit");
        System.out.print("Choose an option: ");
    }

    static void addPayment(Payment payment, List<Payment> payments) {
        payments.add(payment);
        payment.process();
    }

    static void printPayments(List<Payment> payments) {
        if (payments.isEmpty()) System.out.println("No payments have been added.");
        else for (Payment payment : payments) payment.process();
    }
}
