package commandPattern;

public class StereoOffCommand implements Command {
	Stereo stereo;
	
	public StereoOffCommand(Stereo stereo) {
		// TODO Auto-generated constructor stub
		this.stereo = stereo;
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		stereo.off();
	}
	@Override
	public void undo() {
		// TODO Auto-generated method stub
		stereo.on();
	}

}
