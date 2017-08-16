package 案例_试题案例;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		// 构造一个单选题
		//题干
		String t1 = "以下说法错误的是? ";
		//单选题的四个选项
		Option so1 = new Option('A', "==可用于基本类型数据的比较");
		Option so2 = new Option('B', "equals()  可用于引用 类型数据的比较");
		Option so3 = new Option('C', "intanseOf 可用于判断对象的类型");
		Option so4 = new Option('D', "String 是基本数据类型");
		Option[] sOptions = { so1, so2, so3, so4 };
		//代表  此题的正确答案是 D
		char singleAnswer1 = 'D';

		//第一题  构造完成
		Question s1 = new SingleQuestion(t1, sOptions , 0, singleAnswer1);

		////////////////////////////////////////////

		String t2 = "关于 集合 以下说法正确的是? ";

		Option mo1 = new Option('A', "ArrayList比数组好用");
		Option mo2 = new Option('B', "comparable 接口提供了排序功能");
		Option mo3 = new Option('C', "iterator 是类");
		Option mo4 = new Option('D', "Map继承自 Collection ");
		Option[] mOptions = { mo1, mo2, mo3, mo4 };
		//正确答案的数组 
		char[] multiAnswer = { 'A', 'B' };

		//多选题构造完毕
		Question m1 = new MultiQuestion(t2, mOptions , 1 , multiAnswer);
		
		
		String t3 = "填空题";
		Option tk1 = new Option('1',"_______关键字用于引入包");
		Option tk2 = new Option('2',"在定义变量是必须声明变量的______");
		Option tk3 = new Option('3',"接口中的方法是默认______类型");
		Option tk4 = new Option('4',"System类的_____静态方法可以启动垃圾回收器");
		Option[] toptions = {tk1,tk2,tk3,tk4};
		
		Question r1 = new Question(t3,toptions,2) {
			
			@Override
			public boolean check(char[] customerChoice) {
				// TODO Auto-generated method stub
				return false;
			}
		};
		
		String p4 = "判断题";
		Option pd1 = new Option('1',"import关键字用于引入包");
		Option[] p1options = {pd1};
		char singleAnswer2 = 'Y';
		Question z1= new SingleQuestion(p4, p1options, 3,singleAnswer2);
		
		
		Option pd2 = new Option('2',"System类的gc()静态方法可以启动垃圾回收器");
		Option[] p2options = {pd2};
		char singleAnswer3 = 'Y';
		Question z2= new SingleQuestion(p4, p2options, 3,singleAnswer3);
		
		
		
		
		

		/////////////// 题目
		Question[] questions1 = { s1, m1 ,z1,z2};
		Question[] questions2 = { r1 };

		///////////
		// 用户答案
		Answer answer1 = new Answer(new char[] {'D'});
		Answer answer2 = new Answer(new char[] {'B' , 'A' , 'C'});
		Answer answer3 = new Answer(new char[] {'Y'});
		Answer answer4 = new Answer(new char[] {'Y'});
		Answer[] answers = {answer1 , answer2,answer3,answer4 };
		

		/////////////////////
		// 显示题目
		QuestionHandler handler = new QuestionHandler();
		handler.showQuestion(questions1);
		handler.showQuestion(questions2);

		/////////////////////

//		System.out.println("检测结果");
		handler.doCheck(questions1, answers);
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入你的答案-填空题：");
		sc.nextLine();

	}

}
