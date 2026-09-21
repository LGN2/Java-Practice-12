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
        Book firstBook = new Book("Learning Java", "Ishaq");
        Book secondBook = new Book("Object-Oriented Basics", "Fatma");
        Book thirdBook = new Book("Clean Code Practice", "Salim");
        firstBook.printInfo();
        secondBook.printInfo();
        thirdBook.printInfo();
    }
}
