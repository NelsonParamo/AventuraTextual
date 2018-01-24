package model.classes;

import java.awt.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import model.interfaces.Interaction;
import model.interfaces.InteractiveEntityMessage;


/**
 * Patrón de diseño Composite. Clase Base 
 * @author Nelson
 *
 */

interface iInteractiveEntity {
	
}

public abstract class InteractiveEntity {
	private String id;
	protected String description;
	
	private ArrayList<Interaction> availableActions;

	
	public InteractiveEntity(String id){
		this.id = id;
		
		availableActions = new ArrayList<Interaction> (); 
	}
	
	/* Getter Id */
	public String getId (){
		return id;
	}
	
	public String getDescription() {
		return description;
	}

	/* Cada entidad interactiva implementará este método: suministrar una descripción */
	public abstract void setDescription(String description);
	
	
	public void addAvailableAction(Interaction i) {
		int index;
		if ((index = availableActions.indexOf(i)) == -1)
			availableActions.add(i); 
		else 
			System.err.println("ERROR: La acción ya fue registrada anteriormente." );	
	}
	

	public Interaction getAvailableAction(int index) {
		return availableActions.get(index);
		
	}
	abstract public ArrayList<String> getAvailableActions(); 
		
	
	public ArrayList<String> getDefaultAvailableActions (){
		
		ArrayList<String> actions = new ArrayList<String>();
		
		Iterator<Interaction> it; 
		
		it = this.availableActions.iterator();
		
		while (it.hasNext())
		{
			actions.add(it.next().getDescription());
		}
		
		return actions;
	
	}
		
	
}
