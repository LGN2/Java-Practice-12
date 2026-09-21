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

    public static void main(String[] args) {
        System.out.println("Task 425 object model is ready.");
    }
}
