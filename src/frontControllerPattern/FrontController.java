package frontControllerPattern;

/**
 * 用來處理所有進到應用程式的request的single handler
 * 
 * @author coreyou
 *
 */
public class FrontController {
	private Dispatcher dispatcher;

	public FrontController() {
		dispatcher = new Dispatcher();
	}

	private boolean isAuthenticUser() {
		System.out.println("User is authenticated successfully.");
		return true;
	}

	private void trackRequest(String request) {
		System.out.println("Page requested: " + request);
	}

	public void dispatchRequest(String request) {
		// log each request
		trackRequest(request);

		// authenticate the user
		if (isAuthenticUser()) {
			dispatcher.dispatch(request);
		}
	}
}
