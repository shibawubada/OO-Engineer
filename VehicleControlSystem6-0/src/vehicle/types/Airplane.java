package vehicle.types;

public class Airplane extends Aircraft {

	public Airplane(String name) {
		super(name);
	}
	
	@Override
	public String get(){

	    return "/img/airplane.png";

	  }
}
