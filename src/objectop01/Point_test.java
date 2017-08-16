package objectop01;

public class Point_test {

	public static void main(String[] args) {
		
		Point p1 = new Point();
		p1.x=2;
		p1.y=3;
		System.out.println("移动前的坐标："+p1.x+","+p1.y);
		p1.movePoint(4,5);
		Point p2 = new Point();
		p2.x = 1;
		p2.y = 2;
		System.out.println("移动前的坐标："+p2.x+","+p2.y);
		p2.movePoint(4,5);
	}

}
