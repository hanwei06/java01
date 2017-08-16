package day01;

import java.util.Scanner;


public class Test02 {
	
	public static void main(String[] args) {
		
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.println("please write a number:");
	    
	    int i = sc.nextInt();
	    
	    System.out.println("please write the last number:");
	    
	    int j = sc.nextInt();
	    
	    System.out.println("我是奇数:");
	    
	    for(;i<j;i++) {
	    	
	    	if((i%2 ==0)) {
	    		continue;      //跳过
	    	}
	    	
	    	
	    	System.out.println(i);
	    	
	    }
	    
	    
	    
	    
		
		
	}
	

}
