package implementation.interactions;

import model.classes.Player;
import model.classes.Scene;
import model.interfaces.Interaction;
import model.interfaces.SceneMessage;

public class SwitchSceneAction implements Interaction{
	private Player player; 
	private Scene nextScene;
	private String description;

	public void setNextScene(Scene nextScene){
		this.nextScene = nextScene;
	}
	
	public void setPlayerScene (Player player){
		this.player = player; 
	}
	
	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public void doAction() {
		// TODO Auto-generated method stub
		player.setCurrentScene(nextScene);
		
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return description; 
	}

	
	
}
