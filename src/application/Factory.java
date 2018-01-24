package application;

import implementation.interactions.SwitchSceneAction;
import implementation.interactions.TakeDoorKey;
import implementation.props.Door;
import model.classes.InteractiveEntity;
import model.classes.Prop;
import model.classes.Scene;
import model.interfaces.Interaction;

public class Factory {
	
	public InteractiveEntity getEntity(String type, String id)
	{
		switch (type){
		case "Scene":
			return new Scene(id);
		case "Door":
			return new Door (id);
		}
		
		return null;
	}
	
	public SwitchSceneAction getInteraction (String type, String description) {
		switch(type){
			case "SwitchScene":
				return new SwitchSceneAction();
			
		}
		
		return null;
	}
}
