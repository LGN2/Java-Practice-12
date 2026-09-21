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

    public static void main(String[] args) {
        System.out.println("Task 422 object model is ready.");
    }
}
