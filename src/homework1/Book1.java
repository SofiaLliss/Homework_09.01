package homework1;

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
    }



