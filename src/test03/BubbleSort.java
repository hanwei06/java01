package test03;
                        //Ã°ÅİÅÅĞò
public class BubbleSort {
	
	public static void main(String[] args) {
		
		int arr[] = {1,6,2,3,9,4,5,7,8};
		System.out.println("ÅÅĞòÇ°µÄË³ĞòÎª£º");
		for (int num : arr) {
			System.out.print(num+" ");
		}
		
		for(int i=1;i<arr.length;i++) {
			for(int j=0;j<arr.length-i;j++) {
				if (arr[j]>arr[j+1]) {
					int t = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = t;
				}
			}
		}
		
		System.out.println();
		System.out.println("ÅÅĞòºóµÄË³ĞòÎª£º");
		for (int num : arr) {
			System.out.print(num+" ");
		}
	}

}
