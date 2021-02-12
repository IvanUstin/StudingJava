package programmingWithClasses.classesAndObjects.task8;

import java.util.Comparator;

public class CardComparator implements Comparator<Customer> {
    @Override
    public int compare(Customer c1, Customer c2) {
        return Integer.compare(c1.getCard(), c2.getCard());
    }
}
