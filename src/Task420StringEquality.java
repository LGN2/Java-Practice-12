import java.util.Scanner;

public class Task420StringEquality {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter yes: ");
        String answer = scanner.nextLine();
        if (answer == "yes") System.out.println("used ==");
        else System.out.println("== did not match the entered value.");
        if (answer.equals("yes")) System.out.println(".equals() matched the value.");
        else System.out.println("The value is not yes.");
        System.out.println("== compares object addresses, while .equals() compares String values.");
        scanner.close();
    }
}
