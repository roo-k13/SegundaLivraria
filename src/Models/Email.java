package Models;

import Models.Client.PhoneNumber;

public class Email {
    //TODO: https://www.baeldung.com/java-email - Explains how to send an email through java a app
    private Order order;

    public Email(Order order) {
        this.order = order;
    }

    @Override
    public String toString() {
        return order.toString();
    }
}
