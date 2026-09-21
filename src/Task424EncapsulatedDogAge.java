public class Task424EncapsulatedDogAge {
    static class Dog {
        private int age;

        int getAge() { return age; }

        void setAge(int age) {
            if (age > 0) this.age = age;
        }
    }

    public static void main(String[] args) {
        System.out.println("Task 424 object model is ready.");
    }
}
