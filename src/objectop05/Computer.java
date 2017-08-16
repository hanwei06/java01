package objectop05;

public class Computer extends Student{
	
	private double skill;
	private double engwrite;
	public Computer() {
		
	}
	
	public Computer(int no, char sex, int age, String name, double midscore, double lastscore,double skill, double engwrite) {
		super(no, sex, age, name, midscore, lastscore);
		this.skill = skill;
		this.engwrite = engwrite;
	}



	public double getSkill() {
		return skill;
	}
	public void setSkill(double skill) {
		this.skill = skill;
	}
	public double getEngwrite() {
		return engwrite;
	}
	public void setEngwrite(double engwrite) {
		this.engwrite = engwrite;
	}

	@Override
	public double getscore() {
		return skill*0.4+engwrite*0.2+midscore*0.2+lastscore*0.2;
	}
	
//	public double getscore() {
//		return skill*0.4+engwrite*0.2+midscore*0.2+lastscore*0.2;
//		
//	}

}
