package commandPattern;

public class dethrustEngine {
	Component coreEngine;
	
	public dethrustEngine(Component coreEngine) {
		this.coreEngine = coreEngine;
	}
	
	public void execute() {
		coreEngine.levelDown();
	}
	
	public void undo() {
		coreEngine.levelUp();
	}
}
