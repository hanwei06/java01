package objectop01;

public class Rectangle {
	
	public int length;
	public int width;
	
	public Rectangle(int width,int length) {
		this.length = length;
		this.width = width;
	}
	
	public int getArea() {
		return this.length*this.width;                //不会
	}
	
	public int  getPer() {
		return (this.length+this.width)*2;            //不会
	}
	
	public void showAll() {
		System.out.println("长："+length+" 宽："+width+" 面积："+getArea()+" 周长："+getPer());
	}

}
