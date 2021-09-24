package vehicle.types;

public class Ship extends Watercraft {

	public Ship(String name){
		super(name);
	}
	
	@Override
	public String get(){

	    return "/img/ship.png";

	  }
}
