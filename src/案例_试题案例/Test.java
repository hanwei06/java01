package ����_���ⰸ��;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		// ����һ����ѡ��
		//���
		String t1 = "����˵���������? ";
		//��ѡ����ĸ�ѡ��
		Option so1 = new Option('A', "==�����ڻ����������ݵıȽ�");
		Option so2 = new Option('B', "equals()  ���������� �������ݵıȽ�");
		Option so3 = new Option('C', "intanseOf �������ж϶��������");
		Option so4 = new Option('D', "String �ǻ�����������");
		Option[] sOptions = { so1, so2, so3, so4 };
		//����  �������ȷ���� D
		char singleAnswer1 = 'D';

		//��һ��  �������
		Question s1 = new SingleQuestion(t1, sOptions , 0, singleAnswer1);

		////////////////////////////////////////////

		String t2 = "���� ���� ����˵����ȷ����? ";

		Option mo1 = new Option('A', "ArrayList���������");
		Option mo2 = new Option('B', "comparable �ӿ��ṩ��������");
		Option mo3 = new Option('C', "iterator ����");
		Option mo4 = new Option('D', "Map�̳��� Collection ");
		Option[] mOptions = { mo1, mo2, mo3, mo4 };
		//��ȷ�𰸵����� 
		char[] multiAnswer = { 'A', 'B' };

		//��ѡ�⹹�����
		Question m1 = new MultiQuestion(t2, mOptions , 1 , multiAnswer);
		
		
		String t3 = "�����";
		Option tk1 = new Option('1',"_______�ؼ������������");
		Option tk2 = new Option('2',"�ڶ�������Ǳ�������������______");
		Option tk3 = new Option('3',"�ӿ��еķ�����Ĭ��______����");
		Option tk4 = new Option('4',"System���_____��̬����������������������");
		Option[] toptions = {tk1,tk2,tk3,tk4};
		
		Question r1 = new Question(t3,toptions,2) {
			
			@Override
			public boolean check(char[] customerChoice) {
				// TODO Auto-generated method stub
				return false;
			}
		};
		
		String p4 = "�ж���";
		Option pd1 = new Option('1',"import�ؼ������������");
		Option[] p1options = {pd1};
		char singleAnswer2 = 'Y';
		Question z1= new SingleQuestion(p4, p1options, 3,singleAnswer2);
		
		
		Option pd2 = new Option('2',"System���gc()��̬����������������������");
		Option[] p2options = {pd2};
		char singleAnswer3 = 'Y';
		Question z2= new SingleQuestion(p4, p2options, 3,singleAnswer3);
		
		
		
		
		

		/////////////// ��Ŀ
		Question[] questions1 = { s1, m1 ,z1,z2};
		Question[] questions2 = { r1 };

		///////////
		// �û���
		Answer answer1 = new Answer(new char[] {'D'});
		Answer answer2 = new Answer(new char[] {'B' , 'A' , 'C'});
		Answer answer3 = new Answer(new char[] {'Y'});
		Answer answer4 = new Answer(new char[] {'Y'});
		Answer[] answers = {answer1 , answer2,answer3,answer4 };
		

		/////////////////////
		// ��ʾ��Ŀ
		QuestionHandler handler = new QuestionHandler();
		handler.showQuestion(questions1);
		handler.showQuestion(questions2);

		/////////////////////

//		System.out.println("�����");
		handler.doCheck(questions1, answers);
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("��������Ĵ�-����⣺");
		sc.nextLine();

	}

}
