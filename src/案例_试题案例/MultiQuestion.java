package ����_���ⰸ��;

//import org.apache.commons.lang3.ArrayUtils;

public class MultiQuestion extends Question {

	public char[] answer; // ��ȷ��

	public MultiQuestion() {
	}

	public MultiQuestion(String title, Option[] options, int type, char[] answer) {
		super(title, options, type);
		this.answer = answer;
	}

	public char[] getAnswer() {
		return answer;
	}

	public void setAnswer(char[] answer) {
		this.answer = answer;
	}

	@Override
	public boolean check(char[] customerChoice) {
		boolean flag = true; //

		if (customerChoice != null && customerChoice.length == answer.length) { // �𰸵ĸ�������ȷ�𰸵ĸ��� Ҫƥ��

			for (int i = 0; i < answer.length; i++) {//��ÿ����ȷ��ȥ�Ƚ� �û�ѡ��Ĵ�

//				flag = ArrayUtils.contains(customerChoice, answer[i]); //һ��������һ������ , flag �� ��� false ; 

				if (!flag) break;
			}

		} else {
			flag = false;
		}

		return flag;
	}

}
