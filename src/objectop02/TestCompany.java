package objectop02;

public class TestCompany {

	public static void main(String[] args) {
		
		ColaEmployee emp1 = new SalariedEmployee(1,4000);
		emp1.setName("��");
		emp1.setMonth(1);
		ColaEmployee emp2 = new HourlyEmployee(2,50, 120);
		emp2.setName("��");
		emp2.setMonth(3);
		SalesEmployee emp3 = new SalesEmployee(3,4000, 2);
		emp3.setName("��");
		emp3.setMonth(6);
		
		
		
		
		System.out.println("������"+emp1.getName()+" ���ʣ�"+((SalariedEmployee)emp1).Gsalary()+" �����·ݣ�"+emp1.getMonth());
        emp1.getSalary(1);
        System.out.println("������"+emp2.getName()+" ���ʣ�"+((HourlyEmployee)emp2).Hsalary()+" �����·ݣ�"+emp2.getMonth());
        emp2.getSalary(1);
        System.out.println("������"+emp3.getName()+" ���ʣ�"+emp3.salesalary()+" �����·ݣ�"+emp3.getMonth());
        emp3.getSalary(1);
        
	}

}
