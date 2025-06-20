public class Library {
    static class Book {
        String t, a, i;

        Book(String t, String a, String i) {
            this.t = t;
            this.a = a;
            this.i = i;
        }

        void displayDetails() {
            System.out.println("Title: " + t);
            System.out.println("Author: " + a);
            System.out.println("ISBN: " + i);
        }
    }

    public static void main(String[] args) {
        Library.Book b = new Library.Book("Till the last breadth", "Durjoy datta", "978-0061122415");
        b.displayDetails();
    }
}
