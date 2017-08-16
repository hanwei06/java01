package objectop02;

public class SalariedEmployee extends ColaEmployee{
	
	private int Gudingsalary;
	
	public SalariedEmployee(int type,int Gudingsalary) {
		super(type);
		this.Gudingsalary = Gudingsalary;
	}

	public int getGudingsalary() {
		return Gudingsalary;
	}

	public void setGudingsalary(int gudingsalary) {
		Gudingsalary = gudingsalary;
	}

	public  int Gsalary() {
		return this.getGudingsalary();
	}

}
