import java.time.LocalDate;

public class Book {
    private String name;
    private Author author;
    private int yearPublishing;

    public Book(String name, Author author, int yearPublishing) {
        this.name = name;
        this.author = author;
        this.yearPublishing = yearPublishing;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        String fullName = author.getName() + " " + author.getSurname();
        return fullName;
    }

    public int getYearPublishing() {
        return yearPublishing;
    }

    public void setYearPublishing(int yearPublishing) {
        if (yearPublishing > 1950 && yearPublishing <= LocalDate.now().getYear()) {
            this.yearPublishing = yearPublishing;
        } else {
            System.out.println("Некорректный год публикации");
        }
    }
}
