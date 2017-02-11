package mvc;

public class DJTestDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BeatModelInterface model = new BeatModel();
		ControllerInterface controller = new BeatController(model);
	}

}
