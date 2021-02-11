package week1;
import stanford.karel.*;

public class KarelDefendsDemocracy extends SuperKarel {
	

	public void run() {
		while(!frontIsBlocked()) {
			
			if(beepersPresent()) {
				move();
			}
			else{
				goToLeftCorner();
				checkForWall();
				move();
			}

		}
	  
	}
	
	
	public void checkForWall() {	
		if(frontIsClear()) { 
			getBackToMiddle();
			turnRight();
	   }
	   else {
		  goToRightCorner();
		  getBackToMiddle();
	   }
		
	}
	
	
	
	public void turnRight() {
		turnLeft();
		turnLeft();
	}
	
	
	private void keepPicking() {
		if(beepersPresent())
		  while(beepersPresent()) {
			pickBeeper();
		  }
	}
	
	public void goToLeftCorner() {
		 turnLeft();
		 move();
		 keepPicking();
	}
	
	public void goToRightCorner() {
		 turnRight();
		 move();
		 move();
		 keepPicking();
	}
	
	public void getBackToMiddle() {
		 turnRight();
		 move();
		 turnRight();
		 turnLeft();
	}
	
	
		
}
