package objectop01;

public class NoteBook {
	
	public char color;
	public int cpu;
	
	public NoteBook() {
		
	}
	
	public NoteBook(char color,int cpu) {
		this.color = color;
		this.cpu = cpu;
	}
	
	public void show() {
		System.out.println("cpu:"+cpu+" ÑÕÉ«£º"+color);
	}

}
