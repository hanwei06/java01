package objectop01;

public class Company_emp {
	
	private Company_people people;
	private Company_emp up;
	private Company_emp down;
	
	
	public Company_people getPeople() {
		return people;
	}
	public void setPeople(Company_people people) {
		this.people = people;
	}
	
	public Company_emp getUp() {
		return up;
	}
	public void setUp(Company_emp up) {
		this.up = up;
	}
	public Company_emp getDown() {
		return down;
	}
	public void setDown(Company_emp down) {
		this.down = down;
	}

}
