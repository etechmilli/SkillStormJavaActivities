package Vehicle;

public class Person {

	private String name;
	private Vehicle vehicle;

	public Person(String name, Vehicle vehicle) {
		super();
		this.name = name;
		this.vehicle = vehicle;
	}

	void commute() {
		this.vehicle.go();
	}

}
