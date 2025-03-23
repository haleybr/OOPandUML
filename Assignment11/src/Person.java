public abstract class Person {
    protected String name;
    protected String id;
    protected String contactInfo;

    public Person(String name, String id, String contactInfo) {
        this.name = name;
        this.id = id;
        this.contactInfo = contactInfo;
    }
    public Person(String name, String id) {
        this(name, id, "Not provided");
    }
    public abstract void displayDetails();
}
