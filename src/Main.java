public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Лев", "Толстой");
        Author author2 = new Author("Иван", "Тургенев");
        Book book1 = new Book("Война и мир", author1, 1988);
        Book book2 = new Book("Отцы и дети", author2, 1996);

        int newYearPublishing = 2009;
        book1.setYearPublishing(newYearPublishing);

        System.out.println(book1.getName() + ", " + book1.getAuthor() + ", " + book1.getYearPublishing());
        System.out.println(book2.getName() + ", " + book2.getAuthor() + ", " + book2.getYearPublishing());
    }
}