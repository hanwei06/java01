package objectop04;

public abstract class Shape {
	private double area;
	private double per;
	private char color;
	public Shape() {
		
	}
    public Shape(char color) {
		this.color = color;
	}
	
    public abstract double getArea();
    public abstract double getPer();
    public abstract void showAll();
    public char getColor() {
    	return color;
    }
	

}
