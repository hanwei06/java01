package test03;
                  //���鸴��
public class Test15 {
	
	public static void main(String[] args) {
		
		int arr1[] = {1,2,3,4,5};
		int arr2[] = {6,7,8,9,10,11,12};
		System.arraycopy(arr1, 0, arr2, 0, 5);
		for(int i=0;i<arr2.length;i++) {
			System.out.print(arr2[i]+" ");
		}
	}

}
