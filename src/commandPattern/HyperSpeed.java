package commandPattern;

public class HyperSpeed implements Command{

	Component coreEngine;
	
	public HyperSpeed(Component coreEngine) {
		this.coreEngine = coreEngine;
	};
	
	public void execute() {
		System.out.println("Making Jump to Hyper Speed");
		coreEngine.maxLevel();
	}
	
	public void undo() {
		System.out.print("One can't just take back hyperspace.\n");
	}
}
