import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Author author1 = new Author("Лев", "Толстой");
        Author author2 = new Author("Иван", "Тургенев");
        Book book1 = new Book("Война и мир", author1, 1988);
        Book book2 = new Book("Отцы и дети", author2, 1996);
        Author author3 = new Author("Александр", "Пушкин");
        Book book3 = new Book("Капитанская дочка", author3, 2001);
        Author author4 = new Author("Стивен", "Кинг");
        Book book4 = new Book("Сияние", author4, 2011);
        Author author5 = new Author("Джером", "Сэлинджер");
        Book book5 = new Book("Над пропастью во ржи", author5, 2008);

        Library russianLiterature = new Library(10);

        russianLiterature.addNewBook(book1);
        russianLiterature.addNewBook(book2);
        russianLiterature.addNewBook(book3);

//        System.out.println("\nРусская литература:\n");
//        russianLiterature.printBooks();

        Library foreignLiterature = new Library(10);

        foreignLiterature.addNewBook(book4);
        foreignLiterature.addNewBook(book5);

//        System.out.println("\nЗарубежная литература:\n");
//        foreignLiterature.printBooks();

        String searchName = "отцы и дети";
        russianLiterature.printInformation(searchName);

        searchName = "над пропастью во ржи";
        int newYearPublishing = 2000;

        foreignLiterature.changeYearPublishing(searchName, newYearPublishing);
        foreignLiterature.printInformation(searchName);



    }
}