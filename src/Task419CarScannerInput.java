/**
 * Task 419: safe Car input.
 */
import java.util.Scanner;

public class Task419CarScannerInput {
    static class Car {
        String colour;
        String plate;

        void drive() {
            System.out.println(colour + " car " + plate + " is driving.");
        }
    }

    // Runs the Task 419 demonstration.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter car colour: ");
        String colour = scanner.nextLine().trim();
        System.out.print("Enter plate: ");
        String plate = scanner.nextLine().trim();
        if (colour.isEmpty() || plate.isEmpty()) {
            System.out.println("Colour and plate cannot be blank.");
        } else {
            Car car = new Car();
            car.colour = colour;
            car.plate = plate;
            car.drive();
        }
        scanner.close();
    }
}

// Task 419 is complete and follows Java naming conventions.
