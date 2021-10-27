package chapter13;

public class IncThread extends Increment {

	Increment inc;
	
	public IncThread(Increment inc) {
		this.inc = inc;
	}
	public void run() {
		for(int i=0; i<10000; i++) {
			for(int j=0; j<10000; j++) {
				inc= increment;
			}
		}
	}
}
