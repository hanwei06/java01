package objectop03;

import java.util.Scanner;

public class Gardener {
	
	public static void main(String[] args) {
		Gardener a1 = new Gardener();
		a1.creat();
	}
	
	public Fruit creat() {
	  Fruit fruit = null;
	  Scanner sc = new Scanner(System.in);
	  String name = sc.next();
	  if (name.equals("ƻ��")) {
		fruit = new Apple();
	  } else if(name.equals("�㽶")){
		  fruit = new Banana();

	  }else if (name.equals("����")){
		fruit = (Fruit) new Putao();
	  }else {
		System.out.println("������");
	}
	return fruit;
	}
}
