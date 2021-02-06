package commandPattern;

public class EngineRoom {

	public static void main(String[] args) {
		Engine mainEngine = engineRemote.getEngine();
		Engine backUpEngine = engineRemote.getEngine();
		
		ControlPanel MainEnginecontrolPanel = new ControlPanel();
		
		turnEngineOn mainEngineOn = new turnEngineOn(mainEngine);
		turnEngineOff mainEngineOff = new turnEngineOff(mainEngine);
		ThrustEngine thrustMainEngine = new ThrustEngine(mainEngine);
		HyperSpeed mainEngineHyperSpeed = new HyperSpeed(mainEngine);
		
		turnEngineOn backUpEngineOn = new turnEngineOn(backUpEngine);
		turnEngineOff backUpEngineOff = new turnEngineOff(backUpEngine);
		ThrustEngine thrustbackUpEngine = new ThrustEngine(backUpEngine);
		HyperSpeed backUpEngineHyperSpeed = new HyperSpeed(backUpEngine);
		
		MainEnginecontrolPanel.setCommand(0, mainEngineOn, mainEngineOn);
		MainEnginecontrolPanel.setCommand(1, mainEngineOff, mainEngineOff);
		MainEnginecontrolPanel.setCommand(2, thrustMainEngine, thrustMainEngine);
		MainEnginecontrolPanel.setCommand(3, mainEngineHyperSpeed, mainEngineHyperSpeed);

		MainEnginecontrolPanel.controlPanelPress(0);
		MainEnginecontrolPanel.controlPanelPress(3);
		MainEnginecontrolPanel.controlPanelUndo(3);
	}

}
