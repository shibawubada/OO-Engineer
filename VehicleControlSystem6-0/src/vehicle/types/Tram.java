package vehicle.types;

public class Tram extends RailedVehicle {
	
	public Tram(String name) {
		super(name);
		setNocarriages(1);
	}
	
	@Override
	public String get(){

	    return "/img/tram.png";

	  }
}
