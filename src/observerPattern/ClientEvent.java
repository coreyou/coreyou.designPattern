package observerPattern;

public class ClientEvent {
	final String ip;
    final String name;
    
    ClientEvent(Client client) {
        this.ip = client.getIp();
        this.name = client.getName();
    }
}
