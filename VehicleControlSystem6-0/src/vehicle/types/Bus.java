package vehicle.types;

public class Bus extends MotorVehicle {
	
	public Bus(String name){
		super(name);
		setNowheels(6);
	}

	@Override
	public String get(){

	    return "/img/bus.png";

	  }
}
