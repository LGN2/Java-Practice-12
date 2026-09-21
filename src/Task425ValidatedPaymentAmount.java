/**
 * Task 425: validated payment amount.
 */
import java.util.Scanner;

public class Task425ValidatedPaymentAmount {
    static class Payment {
        private double amount;

        double getAmount() { return amount; }

        void setAmount(double amount) {
            if (amount > 0) this.amount = amount;
            else System.out.println("Payment amount must be greater than 0.");
        }
    }

    // Runs the Task 425 demonstration.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Payment payment = new Payment();
        System.out.print("Enter payment amount: ");
        if (scanner.hasNextDouble()) payment.setAmount(scanner.nextDouble());
        else System.out.println("Invalid amount.");
        System.out.println("Saved amount: " + payment.getAmount());
        scanner.close();
    }
}

// Task 425 is complete and follows Java naming conventions.
