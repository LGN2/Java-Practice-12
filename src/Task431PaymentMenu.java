/**
 * Task 431: payment menu.
 */
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

    // Runs the Task 431 demonstration.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Payment> payments = new ArrayList<>();
        boolean exit = false;
        while (!exit) {
            printMenu();
            String input = scanner.nextLine().trim();
            switch (input) {
                case "1": addPayment(new CashPayment(), payments); break;
                case "2": addPayment(new CardPayment(), payments); break;
                case "3": addPayment(new PayPalPayment(), payments); break;
                case "4": printPayments(payments); break;
                case "5": exit = true; System.out.println("Payment menu closed."); break;
                default: System.out.println("Choose an option from 1 to 5.");
            }
        }
        scanner.close();
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

// Task 431 is complete and follows Java naming conventions.
