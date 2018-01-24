package application;

import java.util.ArrayList;
import java.util.Scanner;



import implementation.interactions.SwitchSceneAction;
import implementation.props.Door;

import model.classes.Scene;
import model.classes.World;


public class App {
	public static void main(String args[]) {

		// Patrón singleton
		World world = World.getInstance();

		Factory factory = new Factory();

		Scene scene1 = (Scene) factory.getEntity("Scene", "Sala 1");
		scene1.setDescription("Te encuentras en la sala 1:");

		// Create the scenes
		Scene scene2 = (Scene) factory.getEntity("Scene", "Sala 2");
		scene2.setDescription("Te encuentras en la sala 2:");

		// Props for the scene 1
		Door d = (Door) factory.getEntity("Door", "Move to the LivingRoom1");

		// Scene 1. Interactions
		SwitchSceneAction goToScene2 = factory.getInteraction("SwitchScene", "inter1");
		// Set interaction parameters
		goToScene2.setDescription("Ir a la sala 2");
		goToScene2.setPlayerScene(world.getPlayer());
		goToScene2.setNextScene(scene2);
		
		// Scene 2. Interactions
		SwitchSceneAction goToScene1 = factory.getInteraction("SwitchScene", "inter2");
		// Set interaction parameters
		goToScene1.setDescription("Ir a la sala 1");
		goToScene1.setPlayerScene(world.getPlayer());
		goToScene1.setNextScene(scene1);
		
		// Asign iterations to Scenes
		scene1.addAvailableAction(goToScene2);
		scene2.addAvailableAction(goToScene1);

		// Set player location
		world.getPlayer().setCurrentScene(scene1);

		// Keyboard reader
		// Scanner in = new Scanner (System.in);
		// String val = in.next();
		Scanner scan = new Scanner(System.in);
		String option;
		
		boolean exit = false;
		boolean valid;
		Scene currentScene;
		do {
			currentScene = world.getPlayer().getCurrentScene(); 
			System.out.println(currentScene.getDescription());
			System.out.println(" \nAcciones disponibles: ");
			// Test 1
			ArrayList<String> actions = currentScene.getAvailableActions();
			for (int i = 0; i < actions.size(); ++i)
				System.out.println("\t" + i + ". " + actions.get(i));

			System.out.println("\n\ts. salir");

			System.out.print("\n Acción escogida: ");
			option = scan.nextLine();
			
			exit = option.equals("s");
			int intOp = 0;
	
			if (!exit) {
				try  
				  {  
				     intOp = Integer.parseInt(option);
				     valid = true;
				  }  
				  catch(NumberFormatException nfe)  
				  {  
					  valid = false;
				  }
				
				if ((valid) && (intOp < actions.size())){
					currentScene.getAvailableAction(intOp).doAction();
				}	
			}
			
		} while (!exit);
		
		System.out.println("\nBye");

		
	}
}
