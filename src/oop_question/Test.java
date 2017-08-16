package oop_question;

public class Test {

	public static void main(String[] args) {
		
		String[] options = {"a","b","1"};
		int singleanswer = 1;
		Question a = new SingleChoice("haha", options, singleanswer);
		int[] choices = {2};
		a.check(choices);

	}

}
