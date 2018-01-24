package model.classes;

import java.util.ArrayList;
import java.util.Iterator;

import model.interfaces.InteractiveEntityMessage;
import model.interfaces.SceneMessage;
import model.interfaces.WorldMediator;

/**
 * @author Nelson
 * @description Patrones de diseño: 
 * 			- Singleton
 * 			- Mediator  https://es.wikipedia.org/wiki/Mediator_(patrón_de_diseño)
 *
 */


public final class World implements WorldMediator {
	private Player player;
	private ArrayList<Scene> scenes;
	private ArrayList<InteractiveEntity> entities; 

	
	/* Creación del objeto único */ 
	private static World myWorld = new World();
	
	/**
	 * Constructor Privado 
	 */
	private World() {
		player = Player.createPlayer();
		scenes = new ArrayList<Scene>();
		
		entities = new ArrayList<InteractiveEntity>();
	}
	
	/**
	 * 
	 * @return
	 */
	public static World getInstance() {
		return myWorld;
	}

	@Override
	public Player getPlayer() {
		// TODO Auto-generated method stub
		return player;
	}

	@Override
	public void addScene(Scene scene) {
		// TODO Auto-generated method stub
		scenes.add(scene);
	}

	@Override
	public void removeScene(String id) {
		// TODO Auto-generated method stub
		int index; 
		index = searchInteractiveEntity(id, scenes.iterator() );
		
		if (index != -1)
			scenes.remove(index);
		
	}
	
	private int searchInteractiveEntity(String id, Iterator<?> l) {
		int i = 0; 
		boolean found ; 
		InteractiveEntity e;
		i = 0;
		found = false; 
		do
		{ 
			e = (InteractiveEntity)l.next();
			if (id.equals(e.getId())) 
				found = true;
			else 
				++i;
		}while (!found && l.hasNext());
		
		if (found) {
			scenes.remove(i);
		} 
		else i = -1;
		
		return i;
		
	}
	
	@Override
	public void addEntity(InteractiveEntity entity) {
		// TODO Auto-generated method stub
		entities.add(entity);
		
	}

	@Override
	public void removeEntity(String id) {
		// TODO Auto-generated method stub
		int index; 
		index = searchInteractiveEntity(id, entities.iterator() );
		
		if (index != -1)
			entities.remove(index);
		
	}

	@Override
	public void sendMessageToScene(String id, SceneMessage message) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sendMessageToEntity(String id, InteractiveEntityMessage message) {
		// TODO Auto-generated method stub
		
	}
}
