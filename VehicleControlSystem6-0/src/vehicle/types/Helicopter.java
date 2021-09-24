package vehicle.types;

public class Helicopter extends Aircraft {

	public Helicopter(String name) {
		super(name);
	}
	
	@Override
	public String get(){

	    return "/img/helicopter.png";

	  }
}
