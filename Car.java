
public class Car extends Truck{
	
	double mileage;
	double passengers;
	
	public Car() {
		mileage = 0;
		passengers = 0;
	}
	
	public Car(String manuName, int cylinders, String ownersName, double mileage, double passengers) {
		this.manuName = manuName;
		this.cylinders = cylinders;
		this.ownersName = ownersName;
		this.mileage = mileage;
		this.passengers = passengers;
	}

	public double getmileage() {
		return mileage;
	}

	public void setmileage(double gasMileage) {
		mileage = gasMileage;
		if(mileage>0) {
			mileage = gasMileage;
		}
		else {
			System.out.println("Invalid value, must be positive.");
		}
	}

	public double getpassengers() {
		return passengers;
	}

	public void setpassengers(double numberOfPassengers) {
		passengers = numberOfPassengers;
		if(passengers>0) {
			passengers = numberOfPassengers;
		}
		else {
			System.out.println("Invalid value, must be a positive number");
		}

	}
	@Override
	public String toString() {
		return "Manufacturer's name:" + manuName + ", number of cylinders:" + cylinders + ", owner's name: " + ownersName + "Gas Mileage: " + mileage + ", Number of passengers: " + passengers + ".";
	}
	
	
	
	
	
}
