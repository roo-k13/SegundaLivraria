package Models.Client;

import Models.Email;

public class Client {
    private Name name;
    private Contact contacts;
    private Address address;

    public Client(String firstName, String surname, String emailAddress, Address address) {
        name = new Name(firstName, surname);
        contacts = new Contact(emailAddress);
        address = address;
    }

    public String getName() {
        return name.toString();
    }

    public String getAddress() {
        return address.toString();
    }
}
