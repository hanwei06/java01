package test03;
             //�������ҳ����������������±�
public class Test16 {
	
	public static void main(String[] args) {
		
		int arr[] = {18,25,7,36,13,2,89,63};
		int max = arr[0];
		int index = 0;
		for(int i=0;i<arr.length;i++) {
			if (arr[i]>max) {
				max = arr[i];
				index = i;
			}
		}
		System.out.println("���ֵΪ��"+max+" �±�Ϊ��"+index);
	}
}
