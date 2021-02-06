package commandPattern;

public class ThrustEngine implements Command{
	Component coreEngine;
	
	public ThrustEngine(Component coreEngine) {
		this.coreEngine = coreEngine;
	}
	
	public void execute() {
		coreEngine.levelUp();
	}
	
	public void undo() {
		coreEngine.levelDown();
	}
}
