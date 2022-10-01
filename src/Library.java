public class Library {
    private Book[] books;

    public Library(int libLength) {
        this.books = new Book[libLength];
    }

    public void addNewBook(Book newBook) {
        for (int i = 0; i < this.books.length; i++) {
            if (this.books[i] == null) {
                this.books[i] = newBook;
                return;
            }
        }
    }
    public void printBooks() {
        for (int i = 0; i < this.books.length; i++) {
            if (this.books[i] != null) {
                System.out.println(this.books[i].getAuthor() + ": " + this.books[i].getName() + ": " + this.books[i].getYearPublishing());
            }
        }
    }

    public void printInformation(String name) {
        for (int i = 0; i < this.books.length; i++) {
            if (this.books[i].getName().equalsIgnoreCase(name)) {
                System.out.printf("%s by %s was published in %d\n", books[i].getName(), books[i].getAuthor(), books[i].getYearPublishing());
                break;
            } else if (this.books[i].getName() == null) {
                System.out.println("The book was not found"); // не работает почему-то
                break;
            }
        }
    }

    public void changeYearPublishing(String name, int newYearPublishing) {
        for (int i = 0; i < this.books.length; i++) {
            if (this.books[i].getName().equalsIgnoreCase(name)) {
                this.books[i].setYearPublishing(newYearPublishing);
                break;
            } else if (this.books[i].getName().equalsIgnoreCase(null)) {
                System.out.println("The book was not found"); // не работает почему-то
                break;
            }
        }
    }
}
