package homework1;

import java.util.Objects;

public class Book1 {

    private String bookName;
    private AuthorBook author;
    private int yearOfIssue;


    public Book1(String bookName, AuthorBook author, int yearOfIssue) {
        this.bookName = bookName;
        this.yearOfIssue = yearOfIssue;
        this.author = author;

    }

    public String getBookName() {
        // Создали геттер — метод, который возвращает значение
        return this.bookName;
    }

    public AuthorBook getAuthor() {
        // Создали геттер — метод, который возвращает значение
        return this.author;
    }

    public int getYearOfIssue() {
        // Создали геттер — метод, который возвращает значение
        return this.yearOfIssue;
    }

    public void setYearOfIssue(int yearOfIssue) {
        // Создали сеттер — метод, который меняет значение
        this.yearOfIssue = yearOfIssue;
        // Записываем значение параметра YearOfIssue в свойство YearOfIssue
    }


    @Override
    public boolean equals(Object o) {
       if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        Book1 book1 = (Book1) o;
        return yearOfIssue == book1.yearOfIssue && Objects.equals(bookName, book1.bookName) && Objects.equals(author, book1.author);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(bookName, author, yearOfIssue);
    }

    @Override
    public String toString() {
        // Добавляем метод toString()
        return "Книга " + this.bookName + ", автор которой " + this.author + ", написана в " + this.yearOfIssue + " году.";
        // Возвращаем строку в метод Main
    }
}



