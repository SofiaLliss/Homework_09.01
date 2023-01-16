package homework1;


public class MainHomework {
        public static void main(String[] args) {
            System.out.println("Книга №1");
            AuthorBook author = new AuthorBook("Лев", "Толстой");
            Book book = new Book("Война и мир", author, 1865);
            System.out.println("Название книги - " + book.getBookName());
            System.out.println("Автор - " + book.getAuthor());
            System.out.println("Год выпуска - " + book.getYearOfIssue());

            book.setYearOfIssue(1866); // Вызываем сеттер
            System.out.println("Год перевыпуска - " + book.getYearOfIssue());

            System.out.println(book);


            System.out.println(" ");
            System.out.println("Книга №2");
            AuthorBook newAuthor = new AuthorBook("Стивен", "Кинг");
            Book newBook = new Book("Противостояние", newAuthor, 1978);
            System.out.println("Название книги - " + newBook.getBookName());
            System.out.println("Автор - " + newBook.getAuthor());
            System.out.println("Год выпуска - " + newBook.getYearOfIssue());

        }

    }


