package programmingWithClasses.classesAndObjects.task8;

/**
 * this class defines fields of Customer's object
 */
public class Customer implements Comparable<Customer>{

    private int id;
    private int card;
    private int count;
    private String name;
    private String address;

    public Customer(int id, int card, int count, String name, String address) {
        this.id = id;
        this.card = card;
        this.count = count;
        this.name = name;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCard() {
        return card;
    }

    public void setCard(int card) {
        this.card = card;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", card=" + card +
                ", count=" + count +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    @Override
    public int compareTo(Customer customer) {
        return Integer.compare(this.id, customer.id);
    }
}
