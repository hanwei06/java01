package objectop01;

public class LOL {
	
	public String name;
	public int price;
	public String skill;
	
	public LOL(){
		
	}
	
	public LOL(String name,String skill) {
		this.name = name;
		this.skill = skill;
	}
	
	public void pk() {
		System.out.println("you will defeat");
	}
	
	public void r(String msg) {
		System.out.println("name "+name +msg);
	}
	public void e() {
		System.out.println("skill:"+skill);
	}

}
