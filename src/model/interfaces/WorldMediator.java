package model.interfaces;

import model.classes.InteractiveEntity;
import model.classes.Player;
import model.classes.Scene;

public interface WorldMediator{
	Player getPlayer();
	void addScene(Scene scene);
	void removeScene(String id);
	void sendMessageToScene(String id, SceneMessage message);
	void addEntity(InteractiveEntity entity);
	void removeEntity(String id);
	void sendMessageToEntity(String id, InteractiveEntityMessage message);
}