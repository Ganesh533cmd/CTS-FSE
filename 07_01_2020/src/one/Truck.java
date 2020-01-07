package one;

public class Truck {
	private int dt;
	private final int MILAGE=11;
	public Truck(int initialKM,int finalKM ) {
		super();
		setInitialKM(initialKM);
		setFinalKM(finalKM);
	}
public void calculateDistance() {
	dt=getFinalKM-getInitialKM();
	System.out.println("Initial km:"+getinitialkm()+" Final KM":+getfinalkm()"";
}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
