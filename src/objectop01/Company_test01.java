package objectop01;

public class Company_test01 {

	public static void main(String[] args) {
		
		Company_com neusoft = new Company_com();
		neusoft.setComAdd("tj-konggang");
		neusoft.setComMoney(10000000);
		neusoft.setComName("neusoft");
		neusoft.setComStyle("education");
		
		Company_dep department1 = new Company_dep();
		department1.setDepName("����");
		department1.setDepNum(10);
		department1.setTask("��ѵ");
		
		Company_dep department2 = new Company_dep();
		department2.setDepName("�ල");
		department2.setDepNum(9);
		department2.setTask("�ල");
		
		Company_dep department3 = new Company_dep();
		department3.setDepName("��ҵ");
		department3.setDepNum(7);
		department3.setTask("��ҵ");
		
		Company_people boss = new Company_people();
		boss.setName("boss");
		boss.setAge(50);
		boss.setAdd("����");
		boss.setEmail("boss@s");
		boss.setPhonenum(110);
	    boss.setQqnum(111);
	    boss.setWechat(112);
	    Company_emp empBoss = new Company_emp();
	    empBoss.setPeople(boss);
	    
	    Company_people scott = new Company_people();
	    scott.setName("scott");
	    scott.setAge(40);
	    scott.setAdd("��԰");
	    scott.setEmail("scott@s");
	    scott.setPhonenum(120);
	    scott.setQqnum(121);
	    scott.setWechat(122);
	    Company_emp empScott = new Company_emp();
	    empScott.setPeople(scott);
	    
	    Company_people manege = new Company_people();
	    manege.setName("manage");
	    manege.setAge(35);
	    manege.setAdd("��Ԣ");
	    manege.setEmail("manege@s");
	    manege.setPhonenum(130);
	    manege.setQqnum(131);
	    manege.setWechat(132);
	    Company_emp empManege = new Company_emp();
	    empManege.setPeople(manege);
	    
	    Company_people staff1 = new Company_people();
	    staff1.setName("tom");
	    staff1.setAge(22);
	    staff1.setAdd("�ⷿ");
	    staff1.setEmail("tom@s");
	    staff1.setPhonenum(140);
	    staff1.setQqnum(141);
	    staff1.setWechat(142);
	    Company_emp empStaff1 = new Company_emp();
	    empStaff1.setPeople(staff1);
	    
	    Company_people staff2 = new Company_people();
	    staff2.setName("jack");
	    staff2.setAge(22);
	    staff2.setAdd("�ⷿ");
	    staff2.setEmail("jack@s");
	    staff2.setPhonenum(140);
	    staff2.setQqnum(141);
	    staff2.setWechat(142);
	    Company_emp empStaff2 = new Company_emp();
	    empStaff2.setPeople(staff2);
	    
	    Company_pos pos1 = new Company_pos();
	    pos1.setPosName("boss");
	    pos1.setNum(1);
	    pos1.setPosFunction("����˾ ");
	    Company_salary salary1 = new Company_salary();
	    salary1.setSalaryBoss(1000000);
		salary1.setSalaryStaff(100000);
		salary1.setPos(pos1);
		
		Company_pos pos2 = new Company_pos();
		pos2.setPosName("manege");
		pos2.setNum(2);
		pos2.setPosFunction("�������");
		Company_salary salary2 = new Company_salary();
		salary2.setSalaryManege(500000);
		salary2.setPos(pos2);
		
		Company_pos pos3 = new Company_pos();
		pos3.setPosName("scott");
		pos3.setPosFunction("��������");
		pos3.setNum(3);
		Company_salary salary3 = new Company_salary();
		salary3.setSalaryScott(350000);
		
		Company_pos pos4 = new Company_pos();
		pos4.setNum(5);
		pos4.setPosFunction("���»�������");
		pos4.setPosName("staff");
		Company_salary salary4 = new Company_salary();
	    salary4.setSalaryStaff(100000);
	    
	    System.out.println("��˾��"+neusoft.getComName()+" ע���ʽ�"+neusoft.getComMoney()+" ��˾���ͣ�"+neusoft.getComStyle()+" ��˾��ַ��"+neusoft.getComAdd());

	    System.out.println("��˾����1��"+department1.getDepName()+" ������Ա��"+department1.getDepNum()+" ��������"+department1.getTask());
	    System.out.println("��˾����2��"+department2.getDepName()+" ������Ա��"+department2.getDepNum()+" ��������"+department2.getTask());
	    System.out.println("��˾����3��"+department3.getDepName()+" ������Ա��"+department3.getDepNum()+" ��������"+department3.getTask());
	    
	    System.out.println("�ϰ���Ϣ��"+boss.getName()+" סַ��"+boss.getAdd()+" ���䣺"+boss.getAge()+" ���䣺"+boss.getEmail()+" �绰��"+boss.getPhonenum()+" ΢�ţ�"+boss.getWechat()+" ������"+pos1.getPosFunction()+" н��"+salary1.getSalaryBoss());
	    System.out.println("�߲���Ϣ��"+manege.getName()+" סַ��"+manege.getAdd()+" ���䣺"+manege.getAge()+" ���䣺"+manege.getEmail()+" �绰��"+manege.getPhonenum()+" ΢�ţ�"+manege.getWechat()+" ������"+pos2.getPosFunction()+" н��"+salary2.getSalaryManege());
	    System.out.println("Ա����Ϣ��"+staff1.getName()+" סַ��"+staff1.getAdd()+" ���䣺"+staff1.getAge()+" ���䣺"+staff1.getEmail()+" �绰��"+staff1.getPhonenum()+" ΢�ţ�"+staff1.getWechat()+" ������"+pos4.getPosFunction()+" н��"+salary4.getSalaryStaff());

	
	}

}
