package vehicle.types;

public class Car extends MotorVehicle {
	
	public Car(String name){
		super(name);
		setNowheels(4);
	}

	@Override
	public String get(){

	    return "/img/car.png";

	  }
}
