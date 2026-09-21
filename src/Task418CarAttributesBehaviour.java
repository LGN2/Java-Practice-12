/**
 * Task 418: Car attributes and behaviours.
 */
public class Task418CarAttributesBehaviour {
    static class Car {
        String colour;
        String plate;

        void drive() {
            System.out.println(colour + " car " + plate + " is driving.");
        }

        void brake() {
            System.out.println(colour + " car " + plate + " is braking.");
        }
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.colour = "Black";
        car.plate = "OM-1234";
        car.drive();
        car.brake();
    }
}
