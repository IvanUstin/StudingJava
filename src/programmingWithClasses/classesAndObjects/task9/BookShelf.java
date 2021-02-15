package programmingWithClasses.classesAndObjects.task9;

import java.util.*;

public class BookShelf {
    private List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void author(String author) {
        for (Book book :
                books) {
            if (book.getAuthor().equals(author)) {
                System.out.println(book);
            }
        }
    }

    public void publishing(String publishing) {
        for (Book book :
                books) {
            if (book.getPublishing().equals(publishing)) {
                System.out.println(book);
            }
        }
    }

    public void show() {
        books.sort(new Year());
        for (Book book :
                books) {
            System.out.println(book);
        }
    }

    public void afterYear(int y) {
        for (Book book :
                books) {
            if (book.getPublishingYear() >= y) {
                System.out.println(book);
            }
        }
    }

    class Year implements Comparator<Book> {
        @Override
        public int compare(Book book, Book t1) {
            return Integer.compare(book.getPublishingYear(), t1.getPublishingYear());
        }
    }

}
