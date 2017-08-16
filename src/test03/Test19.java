package test03;

public class Test19 {
	
	public static void main(String[] args) {
		
		int arr[] = {1,1,2,2,3,3,4,4,5,6};
		boolean b =true;
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++) {
				if (arr[i]==arr[j]) {
					arr[j]=0;
				}
				
			}
			System.out.print(arr[i]);
		}
		
	}

}
