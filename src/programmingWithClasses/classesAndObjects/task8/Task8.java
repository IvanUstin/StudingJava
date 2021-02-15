package programmingWithClasses.classesAndObjects.task8;

/**
 * Задача: Создать класс Customer, спецификация которого приведена ниже.
 * Определить конструкторы, set- и get- методы и метод  toString().
 * Создать второй класс, агрегирующий массив типа Customer, с подходящими конструкторами и методами.
 * Задать критерии выбора данных и вывести эти данные на консоль.
 * <p>
 * Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.
 * <p>
 * Найти и вывести:
 * <p>
 * a) список покупателей в алфавитном порядке;
 * <p>
 * b) список покупателей, у которых номер кредитной карточки находится в заданном интервале
 */

public class Task8 {
    public static void main(String[] args) {

        CustomerBook customerBook = new CustomerBook();
        customerBook.add(new Customer(12, 231, 123, "Edvard", "Minsk"));
        customerBook.add(new Customer(13, 765, 123, "Daniel", "Minsk"));
        customerBook.add(new Customer(14, 123, 123, "Candis", "Minsk"));
        customerBook.add(new Customer(15, 342, 123, "Betty", "Minsk"));
        customerBook.add(new Customer(16, 321, 123, "Anne", "Minsk"));


        //initially customers are compared by id
        customerBook.show();
        System.out.println();

        for (Customer c :
                customerBook.cardsInRange(321, 342)) {      // customers, whose card number in defined range
            System.out.println(c);
        }
        System.out.println();

        for (Customer c :
                customerBook.namesByAlphabet()) {           // list of customers, sorted by alphabet
            System.out.println(c);
        }
    }
}
