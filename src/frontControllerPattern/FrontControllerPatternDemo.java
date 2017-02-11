package frontControllerPattern;

public class FrontControllerPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FrontController frontController = new FrontController();
		frontController.dispatchRequest("HOME");
		frontController.dispatchRequest("STUDENT");
	}

}
