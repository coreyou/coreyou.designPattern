package frontControllerPattern;

/**
 * 分派request給對應的handler，Front Controller可能會使用一個dispatcher物件來做這件事
 * 
 * @author coreyou
 *
 */
public class Dispatcher {
	private StudentView studentView;
	private HomeView homeView;

	public Dispatcher() {
		studentView = new StudentView();
		homeView = new HomeView();
	}

	public void dispatch(String request) {
		if (request.equalsIgnoreCase("STUDENT")) {
			studentView.show();
		} else {
			homeView.show();
		}
	}
}
