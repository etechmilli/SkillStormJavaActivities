package Vehicle;

public class Bike implements Vehicle{

	private String color;
	private int numGears;
	
	@Override
	public void go() {
		System.out.println("ring ring");
}
}