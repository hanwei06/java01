package method;

public class Test01 {
	
	public static void main(String[] args) {
		
		int array[] = {1,2,3,4,5,7,8};
		int result[] = add(array, 9);
		
		print(result);
	}
	
	public static void print(int array[]) {
		for (int i : array) {
			System.out.print(i);
		}
	}
	
	public static int[] add(int array[],int data) {
		int result[] = new int [array.length+1];
		for(int i=0;i<array.length;i++) {
			result[i]=array[i];
		}
		result[result.length-1]= data;
		return result;
	}
	
	public static int[] remove(int array[],int index) {
		int result[] ;
		result = new int[index];
		for(int i=0;i<index;i++) {
			result[i] = array[i];
		}
		return result;
	} 

}
