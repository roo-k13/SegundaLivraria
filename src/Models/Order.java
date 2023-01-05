package Models;

import Models.Book.Book;
import Models.Client.Client;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Order {
    private Client client;
    Book[] books;
    BigDecimal price;
    LocalDateTime date;

    private BigDecimal calculateTotalPrice() {
        BigDecimal price = new BigDecimal(0);
        for (Book book: books) {
            price.add(book.getPrice().getValue());
        }
        return price;
    }

    public Order(Client client, Book[] books, LocalDateTime date) {
        this.client = client;
        this.books = books;
        this.date = date;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Client: ").append(client.getName()).append("\n");
        sb.append("Address: ").append(client.getAddress());
        sb.append("Books: ");
        for (Book book: books) {
            sb.append(book);
        }
        sb.append(calculateTotalPrice());
        return sb.toString();
    }
}
