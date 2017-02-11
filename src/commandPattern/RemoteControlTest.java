package commandPattern;
/**
 * ==| Command Pattern 命令模式 |==
 * 將「請求」封裝成物件，將動作和接收者包進物件中，只暴露一個execute()方法，
 * 其他物件不需要知道什麼接收者、進行了什麼動作，只需要知道呼叫execute()方法即可。
 * 
 * @author coreyou
 *
 */
public class RemoteControlTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// simple command pattern test
		/*
		SimpleRemoteControl remote = new SimpleRemoteControl();	// Invoker: 可以去呼叫Command的物件
		Light light = new Light();
		
		LightOnCommand lightOn = new LightOnCommand(light);	// Client建立一個命令物件，以電燈作為receiver		
		remote.setCommand(lightOn);	// 利用setCommand()把命令物件存在Invoker內
		remote.buttonWasPressed();	// 執行command: 在這裡會連動到execute()，execute()中的電燈接收到指令會去執行相關動作
		
		LightOffCommand lightOff = new LightOffCommand(light);
		remote.setCommand(lightOff);
		remote.buttonWasPressed();
		*/
		
		// advanced command pattern test
		RemoteControl remoteControl = new RemoteControl();
		Light light = new Light();
		Stereo stereo = new Stereo();
		LightOnCommand lightOnCommand = new LightOnCommand(light);
		LightOffCommand lightOffCommand = new LightOffCommand(light);
		StereoOnWithCDCommand stereoOnWithCDCommand = new StereoOnWithCDCommand(stereo);
		StereoOffCommand stereoOffCommand = new StereoOffCommand(stereo);
		
		remoteControl.setCommand(0, lightOnCommand, lightOffCommand);
		remoteControl.setCommand(1, stereoOnWithCDCommand, stereoOffCommand);
		
		System.out.println(remoteControl);	// 使用toString()印出每個遙控器插槽
		
		remoteControl.onButtonWasPushed(0);
		remoteControl.offButtonWasPushed(0);
		System.out.println(remoteControl);
		remoteControl.undoButtonWasPushed(0);
		remoteControl.onButtonWasPushed(1);
		remoteControl.offButtonWasPushed(1);
		
		// 測試巨集命令
		System.out.println("測試巨集命令");
		Command[] commandOn = { lightOnCommand, stereoOnWithCDCommand};
		Command[] commandOff = { lightOffCommand, stereoOffCommand};
		MacroCommand macroCommandOn = new MacroCommand(commandOn);
		MacroCommand macroCommandOff = new MacroCommand(commandOff);
		remoteControl.setCommand(2, macroCommandOn, macroCommandOff);
		remoteControl.onButtonWasPushed(2);
		remoteControl.offButtonWasPushed(2);
	}

}
