package objectop01;

public class NoteBookTest {

	public static void main(String[] args) {
		
		NoteBook book1 = new NoteBook();
		book1.color = '��';
		book1.cpu = 100;
		book1.show();
		
		NoteBook book2 = new NoteBook('��',50);
		book2.show();
		
	}

}
