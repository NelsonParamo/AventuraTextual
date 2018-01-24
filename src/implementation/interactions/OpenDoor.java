package implementation.interactions;

import model.classes.Scene;
import model.interfaces.Interaction;

/* Comando Abrir Puerta */

public class OpenDoor implements Interaction{
	private Scene scene;
	private String description; 
	
	public OpenDoor(Scene s, String description){
		this.description = description;
		scene = s; 
	}
	

	@Override
	public void doAction() {
		// TODO Auto-generated method stub
		scene.setDescription("Puerta Abierta");
		
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return description;
	}

}
