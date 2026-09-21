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
        System.out.println("Task 418 object model is ready.");
    }
}
