import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Лев", "Толстой");
        Author author2 = new Author("Иван", "Тургенев");
        Book book1 = new Book("Война и мир", author1, 1988);
        Book book2 = new Book("Отцы и дети", author2, 1996);

        int newYearPublishing = 2009;
        book1.setYearPublishing(newYearPublishing);

        Book[] books = new Book[7];
        books[0] = book1;
        books[1] = book2;

        Author author3 = new Author("Александр", "Пушкин");
        Book book3 = new Book("Капитанская дочка", author3, 2001);
        Author author4 = new Author("Стивен", "Кинг");
        Book book4 = new Book("Сияние", author4, 2011);
        Author author5 = new Author("Джером", "Сэлинджер");
        Book book5 = new Book("Над пропастью во ржи", author5, 2008);

        addNewBook(books, book3);
        addNewBook(books, book4);
        addNewBook(books, book5);
        printBooks(books);


    }

    private static void addNewBook(Book[] books, Book newBook) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = newBook;
                return;
            }
        }
    }

    private static void printBooks(Book[] books) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null) {
                System.out.println(books[i].getAuthor() + ": " + books[i].getName() + ": " + books[i].getYearPublishing());
            }
        }
    }
}