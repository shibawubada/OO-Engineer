package vehicle.types;

public class Motorcycle extends MotorVehicle {
	
	public Motorcycle(String name){
		super(name);
		setNowheels(2);
	}
	
	@Override
	public String get(){

	    return "/img/motorcycle.png";

	  }


}
