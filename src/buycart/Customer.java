package buycart;

import java.util.Arrays;

public class Customer {
	
	private int id;
	private String name;
	private RecInfo[] recInfo;
	
	public Customer() {
		
	}
	
	public Customer(int id, String name, RecInfo[] recInfo) {
		super();
		this.id = id;
		this.name = name;
		this.recInfo = recInfo;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", recInfo=" + Arrays.toString(recInfo) + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public RecInfo[] getRecInfo() {
		return recInfo;
	}
	public void setRecInfo(RecInfo[] recInfo) {
		this.recInfo = recInfo;
	}

}
