package homework1;

public class AuthorBook {
    private String authorName;
    private String authorSurname;

    public String toString() {
        return authorName + " " + authorSurname;
    }

    public AuthorBook(String authorName, String authorSurname) {
        this.authorName = authorName;
        this.authorSurname = authorSurname;
    }

    public String getAuthorName() {
        // Создали геттер — метод, который возвращает значение
        return this.authorName;
    }

    public String getAuthorSurname() {
        // Создали геттер — метод, который возвращает значение
        return this.authorSurname;
    }
}





