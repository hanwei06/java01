package objectop01;

public class Company_test01 {

	public static void main(String[] args) {
		
		Company_com neusoft = new Company_com();
		neusoft.setComAdd("tj-konggang");
		neusoft.setComMoney(10000000);
		neusoft.setComName("neusoft");
		neusoft.setComStyle("education");
		
		Company_dep department1 = new Company_dep();
		department1.setDepName("教育");
		department1.setDepNum(10);
		department1.setTask("培训");
		
		Company_dep department2 = new Company_dep();
		department2.setDepName("监督");
		department2.setDepNum(9);
		department2.setTask("监督");
		
		Company_dep department3 = new Company_dep();
		department3.setDepName("就业");
		department3.setDepNum(7);
		department3.setTask("就业");
		
		Company_people boss = new Company_people();
		boss.setName("boss");
		boss.setAge(50);
		boss.setAdd("别墅");
		boss.setEmail("boss@s");
		boss.setPhonenum(110);
	    boss.setQqnum(111);
	    boss.setWechat(112);
	    Company_emp empBoss = new Company_emp();
	    empBoss.setPeople(boss);
	    
	    Company_people scott = new Company_people();
	    scott.setName("scott");
	    scott.setAge(40);
	    scott.setAdd("花园");
	    scott.setEmail("scott@s");
	    scott.setPhonenum(120);
	    scott.setQqnum(121);
	    scott.setWechat(122);
	    Company_emp empScott = new Company_emp();
	    empScott.setPeople(scott);
	    
	    Company_people manege = new Company_people();
	    manege.setName("manage");
	    manege.setAge(35);
	    manege.setAdd("公寓");
	    manege.setEmail("manege@s");
	    manege.setPhonenum(130);
	    manege.setQqnum(131);
	    manege.setWechat(132);
	    Company_emp empManege = new Company_emp();
	    empManege.setPeople(manege);
	    
	    Company_people staff1 = new Company_people();
	    staff1.setName("tom");
	    staff1.setAge(22);
	    staff1.setAdd("租房");
	    staff1.setEmail("tom@s");
	    staff1.setPhonenum(140);
	    staff1.setQqnum(141);
	    staff1.setWechat(142);
	    Company_emp empStaff1 = new Company_emp();
	    empStaff1.setPeople(staff1);
	    
	    Company_people staff2 = new Company_people();
	    staff2.setName("jack");
	    staff2.setAge(22);
	    staff2.setAdd("租房");
	    staff2.setEmail("jack@s");
	    staff2.setPhonenum(140);
	    staff2.setQqnum(141);
	    staff2.setWechat(142);
	    Company_emp empStaff2 = new Company_emp();
	    empStaff2.setPeople(staff2);
	    
	    Company_pos pos1 = new Company_pos();
	    pos1.setPosName("boss");
	    pos1.setNum(1);
	    pos1.setPosFunction("管理公司 ");
	    Company_salary salary1 = new Company_salary();
	    salary1.setSalaryBoss(1000000);
		salary1.setSalaryStaff(100000);
		salary1.setPos(pos1);
		
		Company_pos pos2 = new Company_pos();
		pos2.setPosName("manege");
		pos2.setNum(2);
		pos2.setPosFunction("管理财务");
		Company_salary salary2 = new Company_salary();
		salary2.setSalaryManege(500000);
		salary2.setPos(pos2);
		
		Company_pos pos3 = new Company_pos();
		pos3.setPosName("scott");
		pos3.setPosFunction("管理人事");
		pos3.setNum(3);
		Company_salary salary3 = new Company_salary();
		salary3.setSalaryScott(350000);
		
		Company_pos pos4 = new Company_pos();
		pos4.setNum(5);
		pos4.setPosFunction("从事基本工作");
		pos4.setPosName("staff");
		Company_salary salary4 = new Company_salary();
	    salary4.setSalaryStaff(100000);
	    
	    System.out.println("公司："+neusoft.getComName()+" 注册资金："+neusoft.getComMoney()+" 公司类型："+neusoft.getComStyle()+" 公司地址："+neusoft.getComAdd());

	    System.out.println("公司部门1："+department1.getDepName()+" 部门人员："+department1.getDepNum()+" 部门任务："+department1.getTask());
	    System.out.println("公司部门2："+department2.getDepName()+" 部门人员："+department2.getDepNum()+" 部门任务："+department2.getTask());
	    System.out.println("公司部门3："+department3.getDepName()+" 部门人员："+department3.getDepNum()+" 部门任务："+department3.getTask());
	    
	    System.out.println("老板信息："+boss.getName()+" 住址："+boss.getAdd()+" 年龄："+boss.getAge()+" 邮箱："+boss.getEmail()+" 电话："+boss.getPhonenum()+" 微信："+boss.getWechat()+" 工作："+pos1.getPosFunction()+" 薪金"+salary1.getSalaryBoss());
	    System.out.println("高层信息："+manege.getName()+" 住址："+manege.getAdd()+" 年龄："+manege.getAge()+" 邮箱："+manege.getEmail()+" 电话："+manege.getPhonenum()+" 微信："+manege.getWechat()+" 工作："+pos2.getPosFunction()+" 薪金："+salary2.getSalaryManege());
	    System.out.println("员工信息："+staff1.getName()+" 住址："+staff1.getAdd()+" 年龄："+staff1.getAge()+" 邮箱："+staff1.getEmail()+" 电话："+staff1.getPhonenum()+" 微信："+staff1.getWechat()+" 工作："+pos4.getPosFunction()+" 薪金："+salary4.getSalaryStaff());

	
	}

}
