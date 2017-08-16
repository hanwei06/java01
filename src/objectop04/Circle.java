package objectop04;



public class Circle extends Shape{
	
	private double radius;
	final double pi = 3.14;
	public Circle() {
		
	}
	public Circle(double radius,char color) {
		super(color);
		this.radius = radius;
	}
	@Override
	public double getArea() {
		double Area = pi*radius*radius;
		return Area;
	}
	@Override
	public double getPer() {
		double Per = 2*pi*radius;
		return Per;
	}
	@Override
	public void showAll() {
		System.out.println("radius:"+radius);
		System.out.println("area:"+getArea());
		System.out.println("per:"+getPer());
		System.out.println("color:"+getColor());
		
	}

	

}
