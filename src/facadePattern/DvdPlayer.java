package facadePattern;

public class DvdPlayer {
	public void on() {
		System.out.println("Dvdplayer on");
	}
	
	public void play(String str) {
		System.out.println("playing " + str);
	}
	
	public void off() {
		System.out.println("Dvdplayer off");
	}
}
