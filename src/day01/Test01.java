package day01;

public class Test01 {
	
	public static void main(String[] args) {
		
		int x = 567;
		int a = x/100;             
		int b = x/10 - 10*a;
		int c = x - a*100 - b*10;
		int s = a + b + c;
		System.out.println(s);
		
		float q = 0f;
		float w;
		w = ((q - 32) * 5 ) / 9;
		System.out.println(w);
		
		
		char t = 'B';
		System.out.println((char)(t+32));
		
		boolean z = false;
		System.out.println(!z);
		
		int v = 1;
		int n = 2;
		System.out.println(v < n);
		
		char p = 'f';
		System.out.println((char)(p-32));
		
		
		
		
	}

}
