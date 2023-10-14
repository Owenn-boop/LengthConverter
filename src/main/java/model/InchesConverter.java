package model;

public class InchesConverter {
	private int inches;
	private float cm;
	private float feet;
	
	public InchesConverter() {
		super();
	}
	
	public InchesConverter(int inches) {
		super();
		this.inches = inches;
		setLengths(inches);
	}
	
	public int getInches() {
		return inches;
	}

	public void setInches(int inches) {
		this.inches = inches;
	}

	public float getCm() {
		return cm;
	}

	public void setCm(float cm) {
		this.cm = cm;
	}

	public float getFeet() {
		return feet;
	}

	public void setFeet(float feet) {
		this.feet = feet;
	}
	
	public void setLengths(int inches) {
		final int INCHES_IN_FOOT = 12; // number of inches in a foot
		final float CM_IN_INCH = 2.54f; // number of cm in an inch
		
		setCm(inches * CM_IN_INCH);
		setFeet(inches / (float) INCHES_IN_FOOT);
	}
	
	
	@Override
	public String toString() {
		return "InchesConverter [inches=" + inches + ", cm=" +
				+ cm + ", feet=" + feet + "]";
	}
}
