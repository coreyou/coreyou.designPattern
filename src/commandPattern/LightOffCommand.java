package commandPattern;
/**
 * Command
 * 
 * @author coreyou
 *
 */
public class LightOffCommand implements Command {
	Light light;
	
	// 建構式傳入某個電燈，一旦呼叫execute()，就由這個電燈負責接受請求，所以電燈是receiver。
	public LightOffCommand(Light light) {
		// TODO Auto-generated constructor stub
		this.light = light;
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		light.off();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		light.on();
	}

}
