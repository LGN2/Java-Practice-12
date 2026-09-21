public class Task424EncapsulatedDogAge {
    static class Dog {
        private int age;

        int getAge() { return age; }

        void setAge(int age) {
            if (age > 0) this.age = age;
        }
    }

    public static void main(String[] args) {
        Dog validDog = new Dog();
        validDog.setAge(5);
        System.out.println("Valid dog age: " + validDog.getAge());
        Dog invalidDog = new Dog();
        invalidDog.setAge(-1);
        System.out.println("Age after setting -1: " + invalidDog.getAge());
    }
}
