package test03;
            //数组中的平均值、最大值、最小值
public class Test18 {
	
	public static void main(String[] args) {
		
		int arr[] = {-10,2,3,246,-100,0,5};
		int max = arr[0];
		int min = arr[0];
		int sum = 0;
		for(int i=0;i<arr.length;i++) {
			if (arr[i]>max) {
				max = arr[i];
			}
			if (arr[i]<min) {
				min = arr[i];
			}
			sum+=arr[i];
		}
		double avg = sum/arr.length;
		System.out.println("max:"+max+"  min:"+min);
		System.out.println("avg:"+avg);
		
	}

}
