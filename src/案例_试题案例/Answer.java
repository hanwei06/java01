package 案例_试题案例;

public class Answer {
	
	private char[] choice; //单选  多选  都放在数组中 . 
	
	public Answer() {}

	public Answer(char[] choice) {
		super();
		this.choice = choice;
	}

	public char[] getChoice() {
		return choice;
	}

	public void setChoice(char[] choice) {
		this.choice = choice;
	}

	
	
	
}
