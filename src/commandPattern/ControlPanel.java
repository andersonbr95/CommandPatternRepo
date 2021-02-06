package commandPattern;

public class ControlPanel {
	Command[] doCommands;
	Command[] undoCommands;
	
	public ControlPanel() {
		doCommands = new Command[5];
		undoCommands = new Command[5];
		
		Command noCommand = new noCommand();
		for(int i = 0; i < 5; i++) {
			doCommands[i] = noCommand;
			undoCommands[i] = noCommand;
		}
	}
	
	public void setCommand(int slot, Command doCommand, Command undoCommand) {
		doCommands[slot] = doCommand;
		undoCommands[slot] = undoCommand;
	}
	
	public void controlPanelPress(int slot) {
		doCommands[slot].execute();
	}
	
	public void controlPanelUndo(int slot) {
		undoCommands[slot].undo();
	}
}
