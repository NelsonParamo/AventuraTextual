package model.interfaces;


/**
 * Patron de diseño: Command
 * 	Desacoplar una abstracción de su implementación
 *
 */

/*Invoker interface */
public interface Interaction {

	public abstract void doAction();
	public abstract String getDescription();
	
}
