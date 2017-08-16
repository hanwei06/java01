package objectop04;



public class Rectangle extends Shape{
	
	private double width;
	private double height;
	public Rectangle() {
		
	}
	

	public Rectangle(double width, double height,char color) {
		super(color);
		this.width = width;
		this.height = height;
	}


	@Override
	public double getArea() {
		double Area = height*width;
		return Area;
	}
	@Override
	public double getPer() {
		double Per = 2*(height+width);
		return Per;
	}
	@Override
	public void showAll() {
		System.out.println("width:"+width);
		System.out.println("height:"+height);
		System.out.println("area:"+getArea());
		System.out.println("per:"+getPer());
		System.out.println("color:"+getColor());
		
		
	}
	
	

}
