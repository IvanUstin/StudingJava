package programmingWithClasses.classesAndObjects.task9;

public class Book {
    private int id;
    private String name;
    private String author;
    private String publishing;
    private int publishingYear;
    private int pageQuantity;
    private int cost;
    private String bindingType;

    public Book(int id, String name, String author, String publishing, int publishingYear, int pageQuantity, int cost, String bindingType) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publishing = publishing;
        this.publishingYear = publishingYear;
        this.pageQuantity = pageQuantity;
        this.cost = cost;
        this.bindingType = bindingType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublishing() {
        return publishing;
    }

    public void setPublishing(String publishing) {
        this.publishing = publishing;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }

    public int getPageQuantity() {
        return pageQuantity;
    }

    public void setPageQuantity(int pageQuantity) {
        this.pageQuantity = pageQuantity;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getBindingType() {
        return bindingType;
    }

    public void setBindingType(String bindingType) {
        this.bindingType = bindingType;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", publishing='" + publishing + '\'' +
                ", publishingYear=" + publishingYear +
                ", pageQuantity=" + pageQuantity +
                ", Cost=" + cost +
                ", bindingType='" + bindingType + '\'' +
                '}';
    }
}
