package objectop02;

public class Company {
	
	public void mysalary(ColaEmployee emp) {
		if (emp.getType() == 1) {
			System.out.println("固定工资：");
		} else if(emp.getType() == 2) {
			System.out.println("小时工工资：");
		}
		else if(emp.getType() == 3)  {
			System.out.println("提成工资：");
		}
	}
  
    
    
}
