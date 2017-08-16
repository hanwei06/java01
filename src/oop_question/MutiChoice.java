package oop_question;

public class MutiChoice extends Question{
	
	private String text;
	private String[] options;
	private int[] answers;
	
	
	public String getText() {
		return text;
	}


	public void setText(String text) {
		this.text = text;
	}

	
	public MutiChoice(String text,String[] options,int[] answers) {
		this.text = text;
		this.options = options;
		this.answers = answers;
	}
	
	
	public String[] getOptions() {
		return options;
	}
	public void setOptions(String[] options) {
		this.options = options;
	}
	public int[] getAnswers() {
		return answers;
	}
	public void setAnswers(int[] answers) {
		this.answers = answers;
	}
	
	@Override
	public boolean check(int[] choices) {
		if (choices==this.answers) {
			return true;
		}else {
			return false;
		}
		
	}

}
