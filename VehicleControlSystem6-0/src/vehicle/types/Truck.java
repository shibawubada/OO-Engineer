package vehicle.types;

public class Truck extends MotorVehicle {
	
	public Truck(String name){
		super(name);
		setNowheels(8);
	}
	
	@Override
	public String get(){

	    return "/img/truck.png";

	  }
}
