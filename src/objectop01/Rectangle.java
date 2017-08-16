package objectop01;

public class Rectangle {
	
	public int length;
	public int width;
	
	public Rectangle(int width,int length) {
		this.length = length;
		this.width = width;
	}
	
	public int getArea() {
		return this.length*this.width;                //����
	}
	
	public int  getPer() {
		return (this.length+this.width)*2;            //����
	}
	
	public void showAll() {
		System.out.println("����"+length+" ��"+width+" �����"+getArea()+" �ܳ���"+getPer());
	}

}
