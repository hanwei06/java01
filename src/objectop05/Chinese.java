package objectop05;

public class Chinese extends Student{
	
	private double yanjiang;
	private double zuopin;
	
	public Chinese() {
		
	}
	
	public Chinese(int no, char sex, int age, String name, double midscore, double lastscore,double yanjiang, double zuopin) {
		super(no, sex, age, name, midscore, lastscore);
		this.yanjiang = yanjiang;
		this.zuopin = zuopin;
	}

	public double getYanjiang() {
		return yanjiang;
	}
	public void setYanjiang(double yanjiang) {
		this.yanjiang = yanjiang;
	}
	public double getZuopin() {
		return zuopin;
	}
	public void setZuopin(double zuopin) {
		this.zuopin = zuopin;
	}

	@Override
	public double getscore() {
		return yanjiang*0.35+zuopin*0.35+midscore*0.15+lastscore*0.15;
	}

}
