package Models.Book;

import java.math.BigDecimal;

public class Book {
    private final int id;
    private final BookName name;
    private final String author;
    private final String publisher;
    private final String language;
    private String description;
    private final int pages;
    private final boolean isFirstEdition;
    private final Price price;

    public Book(int id, String title, String author, String publisher, String language, int pages, boolean isFirstEdition, BigDecimal price) {
        this.id = id;
        this.name = new BookName(title);
        this.author = author;
        this.publisher = publisher;
        this.language = language;
        this.pages = pages;
        this.isFirstEdition = isFirstEdition;
        this.price = new Price(price);
    }

    public Price getPrice() {
        return price;
    }

    public Book(int id, String title, String subtitle, String author, String publisher, String language, int pages, boolean isFirstEdition, BigDecimal price) {
        this(id, title, author, publisher, language, pages, isFirstEdition, price);
        name.setSubtitle(subtitle);
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ID: ").append(id).append("\n");
        sb.append("Name: ").append(name.toString()).append("\n");
        sb.append("Author: ").append(author).append("\n");
        sb.append("Publisher: ").append(publisher).append("\n");
        sb.append("Language: ").append(language).append("\n");
        if (description != null) {
            sb.append("Description: ").append(description).append("\n");
        }
        sb.append("Pages: ").append(pages).append("\n");
        sb.append("Is First Edition: ").append(isFirstEdition).append("\n");
        sb.append("Price: ").append(price);
        return sb.toString();
    }
}
