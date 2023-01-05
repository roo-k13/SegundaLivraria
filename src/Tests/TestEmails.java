package Tests;

import Models.Book.Book;
import Models.Client.Client;
import Models.Email;
import Models.Order;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class TestEmails {
    public static void sendTestOrderEmail() {
        Client client = Clients.getTestClient();
        Book[] books = new Book[5];
        LocalDateTime date = LocalDateTime.now();


        Order order = new Order(client, books, date);
        Email email = new Email(order);
        System.out.println(email);
    }
}
