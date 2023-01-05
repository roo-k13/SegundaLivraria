package Tests;

import Models.Client.Address;
import Models.Client.Client;

public class Clients {
    public static Client getTestClient() {
        Address address = new Address();
        return new Client("Ricardo", "Almeida", "ricardojorge.almeida@bnpparibas.pt", address);
    }
}
