import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Task434SecurePayment {
    static class Payment {
        private static final Set<String> USED_IDS = new HashSet<>();
        private final String id;
        private double amount;
        private String type;

        Payment(String id) {
            String cleanId = id == null ? "" : id.trim();
            if (cleanId.isEmpty() || !cleanId.matches("[A-Za-z0-9-]+"))
                throw new IllegalArgumentException("Payment ID contains unsafe characters.");
            if (!USED_IDS.add(cleanId)) throw new IllegalArgumentException("Payment ID already exists.");
            this.id = cleanId;
        }

        void setAmount(double amount) {
            if (!Double.isFinite(amount) || amount <= 0 || amount > 1_000_000)
                throw new IllegalArgumentException("Amount must be between 0 and 1,000,000.");
            this.amount = amount;
        }

        void setType(String type) {
            String cleanType = type == null ? "" : type.trim().toLowerCase();
            if (!cleanType.equals("cash") && !cleanType.equals("card") && !cleanType.equals("paypal"))
                throw new IllegalArgumentException("Type must be cash, card, or PayPal.");
            this.type = cleanType;
        }

        void printInfo() {
            System.out.printf("Payment %s: %.3f OMR using %s%n", id, amount, type);
        }
    }

    public static void main(String[] args) {
        System.out.println("Unchecked input could accept negative or extremely large amounts.");
        System.out.println("Unsafe text could also be stored or passed to another system as an injection trick.");
        System.out.println("Private fields and validated setters reject unsafe values before storage.");
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter unique payment ID: ");
            Payment payment = new Payment(scanner.nextLine());
            System.out.print("Enter amount: ");
            if (!scanner.hasNextDouble()) throw new IllegalArgumentException("Amount must be numeric.");
            payment.setAmount(scanner.nextDouble());
            scanner.nextLine();
            System.out.print("Enter type (cash/card/paypal): ");
            payment.setType(scanner.nextLine());
            payment.printInfo();
        } catch (IllegalArgumentException exception) {
            System.out.println("Payment rejected: " + exception.getMessage());
        }
        scanner.close();
    }
}
