/**
 * Task 422: AnimalBehaviour interface.
 */
public class Task422AnimalInterface {
    interface AnimalBehaviour {
        void eat();
        void sleep();
        void makeSound();
    }

    static class Dog implements AnimalBehaviour {
        public void eat() { System.out.println("The dog is eating."); }
        public void sleep() { System.out.println("The dog is sleeping."); }
        public void makeSound() { System.out.println("The dog says: Woof!"); }
    }

    // Runs the Task 422 demonstration.
    public static void main(String[] args) {
        AnimalBehaviour dog = new Dog();
        dog.eat();
        dog.sleep();
        dog.makeSound();
    }
}
