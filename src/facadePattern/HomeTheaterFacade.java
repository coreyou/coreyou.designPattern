package facadePattern;
/**
 * ==| Facade Pattern 表象模式 |==
 * 提供了一個統一的介面，來存取次系統中的一群介面，目的為簡化介面的使用方式。
 * 這裡是家庭劇院的表象模式，把看電影的多個步驟與呼叫的多個類別全部包在一起。
 * 
 * 設計守則: 極少化守則(Least Knowledge)，減少物件之間的互動，不要讓太多的類別綑綁在一起。
 * 
 * @author coreyou
 *
 */
public class HomeTheaterFacade {
	DvdPlayer dvd;
	Screen screen;
	
	public HomeTheaterFacade(DvdPlayer dvd, Screen screen) {
		// TODO Auto-generated constructor stub
		this.dvd = dvd;
		this.screen = screen;
	}
	
	public void watchMovie(String movie) {
		System.out.println("Ready to play...");
		screen.down();
		dvd.on();
		dvd.play(movie);	
		System.out.println("");
	}
	
	public void endMovie() {
		System.out.println("Ready to end...");
		dvd.off();
		screen.up();
		System.out.println("");
	}
}
