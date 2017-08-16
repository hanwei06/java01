package objectop01;

public class StudentTest {
	
	public static void main(String[] args) {
		
	

			
		Student s1= new Student("Kitty",1,70);
		Student s2= new Student("Dingdang",2,85);
		Student s3= new Student("Tom",3,60);
		Student[] students = new Student[]{s1,s2,s3};
		Student s = new Student();
		s.sortByScore(students);
		s1.run();

			}

		
		

	}


