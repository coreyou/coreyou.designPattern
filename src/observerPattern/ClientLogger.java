package observerPattern;

public class ClientLogger implements ClientListener {

	@Override
	public void clientAdded(ClientEvent event) {
		// TODO Auto-generated method stub
		System.out.println(event.ip + " added...");
	}

	@Override
	public void clientRemoved(ClientEvent event) {
		// TODO Auto-generated method stub
		System.out.println(event.ip + " removed...");
	}

}
