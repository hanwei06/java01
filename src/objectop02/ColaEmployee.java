package objectop02;

public class ColaEmployee {
	
	private String name;
	private int month;
	private int type;
	
	public ColaEmployee(int type) {
		this.type = type;
	}
    public void getSalary(int month) {
			
			if (this.month==month) {
			   System.out.println("��ǰ�·ݣ�"+month+name+"  ����100");
			}else {
				System.out.println("��ǰ�·ݣ�"+month+"  �޽���");
			}
			
		}
	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

}
