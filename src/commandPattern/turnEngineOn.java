package commandPattern;

public class turnEngineOn implements Command{
	Component coreEngine;
	
	public turnEngineOn(Component coreEngine) {
		this.coreEngine = coreEngine;
	}
	
	public void execute() {
		coreEngine.on();
	}
	
	public void undo() {
		coreEngine.off();
	}
}
