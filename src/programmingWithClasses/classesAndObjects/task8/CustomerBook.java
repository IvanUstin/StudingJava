package programmingWithClasses.classesAndObjects.task8;

import java.util.Set;
import java.util.TreeSet;

public class CustomerBook {
    private Set<Customer>  customerBook  = new TreeSet<>();

    public CustomerBook() {
    }

    public CustomerBook(Set<Customer> s) {
        customerBook.addAll(s);
    }

    public void add(Customer c) {
        customerBook.add(c);
    }

    public void remove(Customer c) {
        customerBook.remove(c);
    }

    public void show() {
        for (Customer c :
                customerBook) {
            System.out.println(c);
        }
    }

    public Set<Customer> cardsInRange(int from, int to) {
        Set<Customer> cardsInRange = new TreeSet<>( new CardComparator());
        for (Customer c :
                customerBook) {
            int card = c.getCard();
            if (card >= from && card <= to) {
                cardsInRange.add(c);
            }
        }
        return cardsInRange;
    }

    public Set<Customer> namesByAlphabet() {
        Set<Customer> customers = new TreeSet<>(new NameComparator());
        customers.addAll(customerBook);
        return customers;
    }
}
