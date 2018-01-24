package model.classes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import model.interfaces.Interaction;



public class Player extends InteractiveEntity {
	
	private Scene currentScene;
	
	private Player(){	
		super("Player"); 	
	}
	
	/**
	 * @description Patrón de diseño: Factory
	 * @return Instancia de Player
	 */
	
	public static Player createPlayer() {
		Player p = new Player();
		return p;
	}
	
	/** 
	 *	ACCIONES DEL JUGADOR 
	 * 
	 */
	
	public Scene getCurrentScene() {
		return this.currentScene; 
	} 

	public void setCurrentScene(Scene currentScene) {
		this.currentScene = currentScene;
	}

	
	@Override
	public void setDescription(String description) {
		// TODO Auto-generated method stub
		super.description = description;
	}
	

	public static void main(String args[]) {
		Player player = Player.createPlayer();
		

	}

	@Override
	public ArrayList<String> getAvailableActions() {
		// TODO Auto-generated method stub
		ArrayList<String> actions; 
		
		actions = super.getDefaultAvailableActions();
		
		return actions;
	}
	
	
	
	
	
}
