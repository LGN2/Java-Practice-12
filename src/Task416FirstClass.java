/**
 * Task 416: first Book class.
 */
public class Task416FirstClass {
    static class Book {
        String title;
        String author;

        void printInfo() {
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
        }
    }

    // Runs the Task 416 demonstration.
    public static void main(String[] args) {
        Book book = new Book();
        book.title = "Java Basics";
        book.author = "Maryam";
        book.printInfo();
    }
}

// Task 416 is complete and follows Java naming conventions.
