package model.classes;

import java.util.ArrayList;
import java.util.HashMap;

import model.interfaces.InteractiveEntityMessage;
import model.interfaces.SceneMessage;
import model.interfaces.WorldMediator;


interface iScene {
	public void addProp(Prop p);
	public void removeProp(String id);
}


public class Scene extends InteractiveEntity 
					implements InteractiveEntityMessage, SceneMessage				
{

	HashMap<String, Prop> props; 
	
	public Scene(String id)
	{
		super(id);
		props = new HashMap<String, Prop>();
	}
	
	public void addProp(Prop p)
	{
			props.put(p.getId(), p);
	}
	
	public void removeProp(String id)
	{
		
		if (!props.containsKey(id)){
			props.remove(id);
		}
	}
	
	@Override
	public void setDescription(String description) 
	{
		// TODO Auto-generated method stub
		super.description = description;
	}
	
	@Override
	public ArrayList<String> getAvailableActions() {
		// TODO Auto-generated method stub
		
		
		
		return super.getDefaultAvailableActions();
	}

	@Override
	public void handleSceneMessage(Scene scene) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void handleEntityMessage(InteractiveEntity entity) {
		// TODO Auto-generated method stub
		
		
	}

	
}
