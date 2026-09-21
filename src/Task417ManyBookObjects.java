public class Task417ManyBookObjects {
    static class Book {
        String title;
        String author;

        Book(String title, String author) {
            this.title = title;
            this.author = author;
        }

        void printInfo() {
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
        }
    }

    public static void main(String[] args) {
        System.out.println("Task 417 object model is ready.");
    }
}
