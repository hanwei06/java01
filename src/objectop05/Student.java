package objectop05;

public abstract class Student {
	
	private int no;
	private char sex;
	private int age;
	private String name;
	protected double midscore;
	protected double lastscore;
	
	public Student() {
		
	}
	
	

	public Student(int no, char sex, int age, String name, double midscore, double lastscore) {
		super();
		this.no = no;
		this.sex = sex;
		this.age = age;
		this.name = name;
		this.midscore = midscore;
		this.lastscore = lastscore;
	}
	public abstract double getscore();
	
	public void show() {
		System.out.println("学号:"+no+"姓名："+name+" 性别："+sex+" 年龄："+age+" 综合成绩："+getscore());
	}



	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public char getSex() {
		return sex;
	}

	public void setSex(char sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMidscore() {
		return midscore;
	}

	public void setMidscore(double midscore) {
		this.midscore = midscore;
	}

	public double getLastscore() {
		return lastscore;
	}

	public void setLastscore(double lastscore) {
		this.lastscore = lastscore;
	}

//	@Override
//	public String toString() {
//		return "Student [no=" + no + ", sex=" + sex + ", age=" + age + ", name=" + name + "]";
//	}
//	

}
