package Models.Client;

public class Contact {
    private String emailAddress;
    private PhoneNumber phoneNumber;

    Contact(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    Contact(String emailAddress, PhoneNumber phoneNumber) {
        this(emailAddress);
        this.phoneNumber = phoneNumber;
    }
}
