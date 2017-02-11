package facadePattern;

public class TestHomeTheater {
	
	public static void main(String[] args) {
		DvdPlayer dvd = new DvdPlayer();
		Screen screen = new Screen();
		HomeTheaterFacade homeTheater = new HomeTheaterFacade(dvd, screen);
		homeTheater.watchMovie("Bat man");
		homeTheater.endMovie();
	}
}
