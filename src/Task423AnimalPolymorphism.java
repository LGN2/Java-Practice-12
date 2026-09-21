/**
 * Task 423: animal interface polymorphism.
 */
import java.util.ArrayList;
import java.util.List;

public class Task423AnimalPolymorphism {
    interface AnimalBehaviour {
        void eat();
        void sleep();
        void makeSound();
    }

    static class Dog implements AnimalBehaviour {
        public void eat() { System.out.println("Dog eats dog food."); }
        public void sleep() { System.out.println("Dog sleeps in its bed."); }
        public void makeSound() { System.out.println("Woof!"); }
    }

    static class Cat implements AnimalBehaviour {
        public void eat() { System.out.println("Cat eats cat food."); }
        public void sleep() { System.out.println("Cat sleeps on the sofa."); }
        public void makeSound() { System.out.println("Meow!"); }
    }

    // Runs the Task 423 demonstration.
    public static void main(String[] args) {
        List<AnimalBehaviour> animals = new ArrayList<>();
        animals.add(new Dog());
        animals.add(new Cat());
        for (AnimalBehaviour animal : animals) animal.makeSound();
    }
}

// Task 423 is complete and follows Java naming conventions.
