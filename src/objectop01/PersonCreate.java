package objectop01;

public class PersonCreate {
	
	public static void main(String[] args) {
		
		Person p1 = new Person();
		p1.length = 177;
		p1.name = "zhangsan";
		p1.weight = 44;
		
		Person p2 = new Person();
		p2.length = 199;
		p2.name = "lisi";
		p2.weight = 33;
		
		p1.sayHello();
		p2.sayHello();
		System.out.println("Œ“≥§"+p1.length);
		
	}
	
	

}
