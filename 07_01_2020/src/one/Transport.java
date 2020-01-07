package one;

public abstract class Transport {

	private int initialKM;
	private int finalKM;
	
	
	public int getInitialKM() {
		return initialKM;
	}
	public void setInitialKM(int initialKM) {
		this.initialKM = initialKM;
	}
	public int getFinalKM() {
		return finalKM;
	}
	public void setFinalKM(int finalKM) {
		this.finalKM = finalKM;
	}
	public void getCalculate() {
		return calculate();
	}
	public void setCalculate(void calculate) {
		this.calculate =calculate;
	}
	public abstract void calculate distance();
	public abstract void calculate fuel();
 
}
