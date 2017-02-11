package commandPattern;
/**
 * 巨集命令
 * 
 * @author coreyou
 *
 */
public class MacroCommand implements Command {
	// 利用陣列儲存一群命令
	Command[] commands;
	
	public MacroCommand(Command[] commands) {
		// TODO Auto-generated constructor stub
		this.commands = commands;
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		// 依序執行陣列中的命令
		for (int i = 0; i < commands.length; i++) {
			commands[i].execute();
		}
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		for (int i = 0; i < commands.length; i++) {
			commands[i].undo();
		}
	}

}
