package observerPattern;

public class Client {
	private String ip;
	private String name;

	public Client(String ip, String name) {
		this.ip = ip;
		this.name = name;
	}

	void setIp(String ip) {
		this.ip = ip;
	}

	void setName(String name) {
		this.name = name;
	}

	String getIp() {
		return ip;
	}

	String getName() {
		return name;
	}
}
