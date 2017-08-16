package objectop02;

public class SalesEmployee extends ColaEmployee{
	
	private int money;
	private int rate;
	
	public SalesEmployee(int type,int money,int rate) {
		super(type);
		this.money = money;
		this.rate = rate;
	}
	
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public int getRate() {
		return rate;
	}
	public void setRate(int rate) {
		this.rate = rate;
	}
	
	public int salesalary() {
		return this.money*this.rate;
	}

}
