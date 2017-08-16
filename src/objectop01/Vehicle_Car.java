package objectop01;

public class Vehicle_Car extends Vehicle{
	
	private int loader;
	
	public int getLoader() {
		return loader;
	}

	public void setLoader(int loader) {
		this.loader = loader;
	}

	public Vehicle_Car() {
		
	}
	
	@Override
	public void run() {
		System.out.println("这辆"+getBrand()+getColor()+"载人："+getLoader()+"的轿车在奔跑");
	}

}
