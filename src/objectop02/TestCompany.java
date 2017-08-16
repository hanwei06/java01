package objectop02;

public class TestCompany {

	public static void main(String[] args) {
		
		ColaEmployee emp1 = new SalariedEmployee(1,4000);
		emp1.setName("甲");
		emp1.setMonth(1);
		ColaEmployee emp2 = new HourlyEmployee(2,50, 120);
		emp2.setName("乙");
		emp2.setMonth(3);
		SalesEmployee emp3 = new SalesEmployee(3,4000, 2);
		emp3.setName("丙");
		emp3.setMonth(6);
		
		
		
		
		System.out.println("姓名："+emp1.getName()+" 工资："+((SalariedEmployee)emp1).Gsalary()+" 生日月份："+emp1.getMonth());
        emp1.getSalary(1);
        System.out.println("姓名："+emp2.getName()+" 工资："+((HourlyEmployee)emp2).Hsalary()+" 生日月份："+emp2.getMonth());
        emp2.getSalary(1);
        System.out.println("姓名："+emp3.getName()+" 工资："+emp3.salesalary()+" 生日月份："+emp3.getMonth());
        emp3.getSalary(1);
        
	}

}
