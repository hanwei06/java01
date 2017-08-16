package objectop01;

public class LOL_test {
	
	public static void main(String[] args) {
		
		LOL ys = new LOL();
		ys.name = "yasuo";
		ys.skill = "hasaqi";
		ys.price = 6300;
		
		LOL fish = new LOL();
		fish.name = "fizz";
		fish.skill = "sharks";
		fish.price = 6300;
		
		LOL aLol = new LOL("ashe","fei");
		
		
		System.out.println(ys.skill);
		System.out.println(aLol.name);
		fish.pk();
		fish.r("   eat the shark");
		ys.e();
	}

}
