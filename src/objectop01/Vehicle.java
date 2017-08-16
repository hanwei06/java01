package objectop01;

public class Vehicle {
	
	private String brand;
	private String color;
	private double speed;
	
	public Vehicle() {
		
	}
	
	public Vehicle(String brand,String color) {
		this.brand = brand;
		this.color = color;
		speed = 0;
	}
	
	public void run() {
		System.out.println("The "+brand+" is run with "+speed);
		
	}

	
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

}
