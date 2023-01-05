package Models.Client;

public class Name {
    String firstName;
    String surname;

    Name(String firstName, String surname) {
        this.firstName = firstName;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return firstName + " " + surname;
    }
}
