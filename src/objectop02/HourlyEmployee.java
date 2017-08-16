package objectop02;

public class HourlyEmployee extends ColaEmployee {
	
	private int Hoursalary;
	private int hour;
	
	public HourlyEmployee(int type,int Hoursalary,int hour) {
		super(type);
		this.hour = hour;
		this.Hoursalary = Hoursalary;
	}
//	public HourlyEmployee(int Hoursalary,int hour) {
//		this.hour = hour;
//		this.Hoursalary = Hoursalary;
//	}
	
	public int getHoursalary() {
		return Hoursalary;
	}
	public void setHoursalary(int hoursalary) {
		Hoursalary = hoursalary;
	}
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		this.hour = hour;
	}
	
	public double Hsalary() {
		if (hour<160) {
			return this.hour*this.Hoursalary;
		} else {
			return (this.Hoursalary)*160+(this.hour-160)*1.5;

		}
	}
	

}
