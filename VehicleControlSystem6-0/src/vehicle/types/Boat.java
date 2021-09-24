package vehicle.types;

public class Boat extends Watercraft {

	public Boat(String name){
		super(name);
	}
	
	@Override
	public String get(){

	    return "/img/boat.png";

	  }
}
