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
		System.out.println("����"+getBrand()+getColor()+"���ˣ�"+getLoader()+"�Ľγ��ڱ���");
	}

}
