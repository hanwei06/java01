package objectop02;

public class Company {
	
	public void mysalary(ColaEmployee emp) {
		if (emp.getType() == 1) {
			System.out.println("�̶����ʣ�");
		} else if(emp.getType() == 2) {
			System.out.println("Сʱ�����ʣ�");
		}
		else if(emp.getType() == 3)  {
			System.out.println("��ɹ��ʣ�");
		}
	}
  
    
    
}
