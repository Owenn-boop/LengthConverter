package model;

public class MilesConverter {
	private float miles;
	private float kilometers;
	
	public MilesConverter() {
		super();
	}
	
	public MilesConverter(float miles) {
		super();
		this.miles = miles;
		setLengths(miles);
	}
	
	public float getMiles() {
		return miles;
	}

	public void setMiles(float miles) {
		this.miles = miles;
	}

	public float getKilometers() {
		return kilometers;
	}

	public void setKilometers(float kilometers) {
		this.kilometers = kilometers;
	}

	public void setLengths(float miles) {
		final float KILOMETERS_IN_MILE = 1.60934f; //number of kilometers in a mile
		
		setKilometers(miles * KILOMETERS_IN_MILE);
	}
	
	
	@Override
	public String toString() {
		return "MilesConverter [miles=" + miles + ", kilometers=" +
				+ kilometers + "]";
	}
}
