package Tests;

import Models.Client.Address;

public class TestAddresses {
    private static Address[] testAddresses = CreateTestAddresses();

    private static Address[] CreateTestAddresses() {
        testAddresses = new Address[2];
        testAddresses[0] = new Address("Avenida Almirante Gago Coutinho", 26, 1000, 017, "Areeiro", "Lisboa");
        testAddresses[1] = new Address("Rua Raúl Brandão", 20, "3", "E", 2620, 392, "Ramada e Caneças", "Odivelas");
        return testAddresses;
    }
}
