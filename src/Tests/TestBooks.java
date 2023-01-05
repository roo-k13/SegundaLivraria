package Tests;

import Models.Book.Book;

import java.math.BigDecimal;

public class TestBooks {
    public static Book[] getTestBooks() {
        Book[] testBooks = new Book[2];
        testBooks[0] = new Book(1, "Uma Viagem à Índia ", "Gonçalo M. Tavares",
                "Caminho", "Portuguese", 484, false, BigDecimal.valueOf(16));
        testBooks[1] = new Book(2, "Engenheiro do Tempo Perdido", "Entrevistas com Pierre Cabanne",
                "Marcel Duchamp", "Assírio e Alvim", "Portuguese", 240,
                false, BigDecimal.valueOf(13));
        return testBooks;
    }
}
