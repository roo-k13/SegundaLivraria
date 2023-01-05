package ConsoleApp;

import Models.Book.Book;
import Tests.TestEmails;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        // ================ Test Books ================

        for (Book book: Tests.TestBooks.getTestBooks()) {
            System.out.println(book);
            System.out.println("======================");
        }

        // ================ Test Emails ================

        TestEmails.sendTestOrderEmail();
    }
}