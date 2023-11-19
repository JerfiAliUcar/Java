package Flyables;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		Bird f1= new Bird();
		Flyable f4= new Eagle();
		Flyable f2= new Plane();
		Flyable f3 = new Flyable() {
			@Override
			public void fly() {
				System.out.println(" Something is"
						+ " flying ");
				
			}

	};

	FlyWithme(f1);
	FlyWithme(f2);
	FlyWithme(f3);
	FlyWithme(f4);
	
}
	public static void FlyWithme(Flyable f) {
		
		f.fly();
		
	}
	
}
