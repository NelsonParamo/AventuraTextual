package implementation.interactions;

import model.classes.Player;
import model.interfaces.Interaction;

public class TakeDoorKey implements Interaction{
	Player p; 
	String description; 
	
	public TakeDoorKey(String description) {
		this.description = description;
	}
	
	@Override
	public void doAction() {
		// TODO Auto-generated method stub
		
		// Include the interaction onlock Door to the player
		
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return description;
	}

	
}
