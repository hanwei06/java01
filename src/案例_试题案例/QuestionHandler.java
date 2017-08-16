package ����_���ⰸ��;

public class QuestionHandler {

	// ����...
	public void doCheck(Question[] questions, Answer[] answers) {

		System.out.println("�������Ϊ : ");

		String result = "";

		for (int i = 0; i < questions.length; i++) {

			if (questions[i].check(answers[i].getChoice())) {  //���� Answer ��  , ������  ����������� 

				result = "��" + (i + 1) + " : �� ";
			} else {
				result = "��" + (i + 1) + " : �� ";
			}

			System.out.println(result);
		}

	}

	// ��ʾ��Ŀ..
	public void showQuestion(Question[] questions) {

		if (questions != null && questions.length > 0) { // ��Ϊ����ѭ�� , �Է� ��ָ���쳣  NullPointException
			for (int i = 0; i < questions.length; i++) {

				System.out.println("��Ŀ " + (i + 1) + " : " + questions[i].getTitle());
				for (Option option : questions[i].getOptions()) {
					System.out.println(option.getKey() + " . " + option.getText());
				}
				System.out.println("***************************");

			}
		}

	}

}
