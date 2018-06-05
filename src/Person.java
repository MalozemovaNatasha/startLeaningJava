public class Person {
    private String FirstName;
    private String LastName;

    Person(String firstName, String lastName) {
        this.FirstName = firstName;
        this.LastName = lastName;
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }
}
