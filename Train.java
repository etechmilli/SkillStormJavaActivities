package Vehicle;

public class Train implements Vehicle{ 
	private String color;
	private int numCars;
	
	@Override
	public void go() {
		System.out.println("BBBBOOOOOOOMMMMMM");
	}
}
