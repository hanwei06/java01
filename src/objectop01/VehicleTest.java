package objectop01;

public class VehicleTest {

	public static void main(String[] args) {
		
		Vehicle car1 = new Vehicle("benz", "black");
		car1.run();
		car1.setSpeed(20);
		
		Vehicle_Car car2 = new Vehicle_Car();           //调用子类要写子类的名称
		car2.setBrand("Honda");
		car2.setColor("red");
		car2.setLoader(2);
		car2.run();
		
		

	}

}
