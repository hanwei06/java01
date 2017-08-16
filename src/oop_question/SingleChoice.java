package oop_question;

public class SingleChoice extends Question{
	
	private String text;
	private String[] options;
	private int answer;
	
	public SingleChoice(String text,String[] options,int answer) {
		this.text = text;
		this.options = options;
		this.answer = answer;
	}
	
	
	
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String[] getOptions() {
		return options;
	}
	public void setOptions(String[] options) {
		this.options = options;
	}
	public int getAnswer() {
		return answer;
	}
	public void setAnswer(int answer) {
		this.answer = answer;
	}
	
	@Override
	public boolean check(int[] choices) {
	    if (choices[0] == this.answer) {
	    	
	    	System.out.println("yes");
	    	return true;
		}else {
			System.out.println("no");
			return false;
			
		}
	}

}
