package implementation.props;


import java.util.ArrayList;

import model.classes.Prop;

public class Door extends Prop {
	boolean isOpenned;
	
	public Door(String id) {
		super(id);
		// TODO Auto-generated constructor stub
	}
	
	public void setIsOpen (boolean isOpenned){
		this.isOpenned = isOpenned;	
	}
	
	@Override
	public void setDescription(String description) {
		// TODO Auto-generated method stub
		 super.description = (description);
	}

	@Override
	public ArrayList<String> getAvailableActions() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
