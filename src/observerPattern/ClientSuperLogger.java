package observerPattern;

public class ClientSuperLogger implements ClientListener {

	@Override
	public void clientAdded(ClientEvent event) {
		// TODO Auto-generated method stub
		System.out.println("super logger " + event.ip + " added...");
	}

	@Override
	public void clientRemoved(ClientEvent event) {
		// TODO Auto-generated method stub
		System.out.println("super logger " + event.ip + " removed...");
	}

}
