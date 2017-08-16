package day01;
               //冒泡排序
public class BubbleSort {
	
	public static void main(String[] args) {
		
		int arr[] = {2,8,4,7,9,3};
		System.out.println("排序前的顺序为：");
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
		System.out.println("排序后的数组为：");
		for (int num : arr) {
			System.out.print(num+" ");
		}
	}
		
	}


