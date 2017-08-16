package objectop01;

public class Student implements Bcak{
	
	public String name;
	public int no;
	public int score;
	
	public Student(String name, int no, int score) {
		this.name = name;
		this.no = no;
		this.score = score;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public Student() {
		
	}

		

	
	public void sortByScore(Student[] students){
		int max= students[0].score;
		for(int i =0 ;i<students.length;i++){
			for(int j = 0;j<students.length;j++){
				if(students[i].getScore()>students[j].getScore()){
					Student b = students[i];
					students[i] = students[j];
					students[j] = b;
				}
			}
		}
		System.out.println("按成绩排序后的结果如下:");
		for(int i = 0 ;i<students.length;i++){
			System.out.print(students[i].getName() + " "+ students[i].getNo()+" "+students[i].getScore());
			System.out.println();
		}
	}

	@Override
	public void run() {
		System.out.println("runrunrun");
		
	}

}



