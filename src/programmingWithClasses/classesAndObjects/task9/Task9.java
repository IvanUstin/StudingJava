package programmingWithClasses.classesAndObjects.task9;

/**
 * Создать класс Book, спецификация которого приведена ниже.
 * Определить конструкторы, set- и get- методы и метод  toString().
 * Создать второй класс, агрегирующий массив типа Book,
 * с подходящими конструкторами и методами.
 * Задать критерии выбора данных и вывести эти данные на консоль.
 *
 * Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.
 *
 * Найти и вывести:
 *
 * a) список книг заданного автора;
 *
 * b) список книг, выпущенных заданным издательством;
 *
 * c) список книг, выпущенных после заданного года.
 */
public class Task9 {
    public static void main(String[] args) {

        BookShelf bookShelf = new BookShelf();
        bookShelf.addBook(new Book(1, "1984", "Orual", "AST", 1970, 300, 5, "straight"));
        bookShelf.addBook(new Book(2, "airport", "Haily", "Booker", 1960, 200, 5, "straight"));
        bookShelf.addBook(new Book(3, "dracula", "Stoker", "Booker", 1950, 400, 5, "straight"));
        bookShelf.addBook(new Book(4, "Solaris", "Lem", "AST", 1940, 100, 5, "straight"));
        bookShelf.addBook(new Book(5, "Three friends", "Remark", "Booker", 1930, 300, 5, "straight"));
        bookShelf.addBook(new Book(6, "Dark Obelisk", "Remark", "AST", 1940, 300, 5, "straight"));

        bookShelf.show();
        System.out.println();
        bookShelf.afterYear(1966);
        System.out.println();
        bookShelf.author("Remark");
        System.out.println();
        bookShelf.publishing("Booker");
    }
}
