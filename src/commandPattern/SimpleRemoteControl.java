package commandPattern;
/**
 * Invoker: 實際上會去呼叫命令的物件
 * 
 * @author coreyou
 *
 */
public class SimpleRemoteControl {
	Command slot;	// 遙控器上某一個按鈕，用來控制某個裝置。
	
	public SimpleRemoteControl() {
		// TODO Auto-generated constructor stub
	}
	
	// 用來設定按鈕的功能，若想要改變按鈕的功能，可以多次呼叫此方法。
	public void setCommand(Command command) {
		slot = command;
	}
	
	public void buttonWasPressed() {
		slot.execute();
	}
}
