package commandPattern;

public class Engine implements Component{
	
	int engineLevel = 0;
	
	@Override
	public void on() {
		System.out.print("Engines On"+"\n");// TODO Auto-generated method stub
		
	}

	@Override
	public void off() {
		System.out.print("Engines Off"+"\n");// TODO Auto-generated method stub
		
	}

	@Override
	public void levelUp() {
		engineLevel++;
		// TODO Auto-generated method stub
		
		if (engineLevel > 1) {
			System.out.print("Increasing Engine Power Engine level is currently "+ engineLevel+"\n");
		}
		else if (engineLevel >= 10) {
			System.out.print("WARNING! Engines level Critical"+"\n");
		}
	}
	
	@Override
	public void maxLevel(){
		for (int i = 0; i < 11; i++) {
			engineLevel++;
			System.out.print("Increasing Engine Power Engine level is currently "+ engineLevel+"\n");
			if (engineLevel >= 10) {
				System.out.print("WARNING! Engines level Critical\n");
			}
		}
	}
	
	@Override
	public void levelDown() {
		engineLevel--;
		if (engineLevel > 1) {
			System.out.print("Decreasing Engine Power. Engine level is currently "+ engineLevel +"\n");
		}
		else if (engineLevel == 0) {
			System.out.print("Shutting Engines Down"+"\n");
		}
	}
}


