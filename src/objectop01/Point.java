package objectop01;

public class Point {
	
	public int x;
	public int y;
	
	
	public Point() {
		
	}
	
//	public Point(int x0,int y0) {
//		this.x0=x;
//		this.y0=y;
//	}
	
	public void movePoint(int dx,int dy) {

		System.out.println("移动后的坐标："+(x+dx)+","+(y+dy));
	}

}
