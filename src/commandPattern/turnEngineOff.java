package commandPattern;

public class turnEngineOff implements Command{
	Component coreEngine;
	
	public turnEngineOff(Component coreEngine) {
		this.coreEngine = coreEngine;
	}
	
	public void execute() {
		coreEngine.off();
	}
	
	public void undo() {
		coreEngine.on();
	}
}
 