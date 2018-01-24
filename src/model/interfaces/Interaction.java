package model.interfaces;


/**
 * Patron de dise�o: Command
 * 	Desacoplar una abstracci�n de su implementaci�n
 *
 */

/*Invoker interface */
public interface Interaction {

	public abstract void doAction();
	public abstract String getDescription();
	
}
