package test03;
                      import java.util.ArrayList;
//查找指定元素
import java.util.Arrays;
import java.util.List;

public class Test20 {
	
	public static void main(String[] args) {
		
		int arr1[] = {1,2,3,4,5};
		int index1 = Arrays.binarySearch(arr1, 3);
		System.out.println("3的位置："+index1);
		int arr2[] = {6,7,8,9,10,11};
		List list = new ArrayList(Arrays.asList(arr1));
		list.addAll(Arrays.asList(arr2));
		Object[] c = list.toArray();
		System.out.println(Arrays.toString(c));
	}

}
