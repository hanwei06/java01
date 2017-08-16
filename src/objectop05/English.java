package objectop05;

public class English extends Student{
	
	private double speech;
	public English() {
		
	}
	
	public English(int no, char sex, int age, String name, double midscore, double lastscore,double speech) {
		super(no, sex, age, name, midscore, lastscore);
		this.speech = speech;
	}

	public double getSpeech() {
		return speech;
	}

	public void setSpeech(double speech) {
		this.speech = speech;
	}
	
	@Override
	public double getscore() {
		
			return speech*0.5+midscore*0.25+lastscore*0.25;
		
	}

}
