package Flyables;


public class Bird extends LayEggs  implements Flyable{

	@Override
	public void fly() {
		System.out.println(" BIRD is flying ");	
	}

}
