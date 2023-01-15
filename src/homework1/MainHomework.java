package homework1;


public class MainHomework {
        public static void main(String[] args) {
            System.out.println("Книга №1");
            AuthorBook author = new AuthorBook("Лев", "Толстой");
            Book1 bookWaP = new Book1("Война и мир", author, 1865);
            System.out.println("Название книги - " + bookWaP.getBookName());
            System.out.println("Автор - " + bookWaP.getAuthor());
            System.out.println("Год выпуска - " + bookWaP.getYearOfIssue());

            bookWaP.setYearOfIssue(1866); // Вызываем сеттер
            System.out.println("Год перевыпуска - " + bookWaP.getYearOfIssue());


            System.out.println(" ");
            System.out.println("Книга №2");
            AuthorBook newAuthor = new AuthorBook("Стивен", "Кинг");
            Book1 newBook = new Book1("Противостояние", newAuthor, 1978);
            System.out.println("Название книги - " + newBook.getBookName());
            System.out.println("Автор - " + newBook.getAuthor());
            System.out.println("Год выпуска - " + newBook.getYearOfIssue());


        }
    }

