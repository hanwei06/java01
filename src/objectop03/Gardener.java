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
	  if (name.equals("苹果")) {
		fruit = new Apple();
	  } else if(name.equals("香蕉")){
		  fruit = new Banana();

	  }else if (name.equals("葡萄")){
		fruit = (Fruit) new Putao();
	  }else {
		System.out.println("不会种");
	}
	return fruit;
	}
}
