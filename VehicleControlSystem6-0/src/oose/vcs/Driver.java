package oose.vcs;

import java.io.File;

import vehicle.types.Vehicle;

public class Driver {

	private static Vehicle vehicle;
	
	public static void main(String args[]) {		
		new Controller();
	}
	
	public void initialiseVehicle(String vehicleName) {	

		Condition.valueOf(vehicleName).execute();
	}

	public enum Condition {

		Boat {
			@Override
			void execute(){
				vehicle = new vehicle.types.Boat("Apollo ");
			}		
		},

		Ship {
			@Override
			void execute(){
				vehicle = new vehicle.types.Ship("Cruizz");
			}
		},

		Truck {
			@Override
			void execute(){
				vehicle = new vehicle.types.Truck("Ford F-650");
			}
		},

		MotorCycle {
			@Override
			void execute(){
				vehicle = new vehicle.types.Motorcycle("Suzuki");
			}
		},

		Bus {
			@Override
			void execute(){
				vehicle = new vehicle.types.Bus("Aero");
			}
		},

		Car {
			@Override
			void execute(){
				vehicle = new vehicle.types.Car("BMW");
			}
		},

		Bicycle {
			@Override
			void execute(){
				vehicle = new vehicle.types.Bicycle("A-bike");
			}
		},

		Helicopter {
			@Override
			void execute(){
				vehicle = new vehicle.types.Helicopter("Eurocopter");
			}
		},

		Airplane {
			@Override
			void execute(){
				vehicle = new vehicle.types.Airplane("BA");
			}
		},

		Tram {
			@Override
			void execute(){
				vehicle = new vehicle.types.Tram("EdinburghTram");
			}
		},

		Train {
			@Override
			void execute(){
				vehicle = new vehicle.types.Train("Virgin",4);
			}
		},;

		abstract void execute();
	}
	
	public Vehicle getVehicle() {
		
		return vehicle;
	}
	
	public File setDisplayObject() {
		
		return new File(System.getProperty("user.dir")+vehicle.get());
	}
	
}
