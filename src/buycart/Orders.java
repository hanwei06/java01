package buycart;

import java.util.Date;

public class Orders {
	
	private String oid;
	private Date Date;
	private RecInfo recInfos; 
	private Buycart buycart;
	private Item item;
	private Product product;
	
	public Orders(String oid, Date date, RecInfo recInfos, Buycart buycart) {
		super();
		this.oid = oid;
		Date = date;
		this.recInfos = recInfos;
		this.buycart = buycart;
	}
	

	@Override
	public String toString() {
		return "Orders [oid=" + oid + ", Date=" + Date + ", recInfos=" + recInfos + ", buycart=" + buycart + "]";
	}
	
	public void show() {
		System.out.println("订单编号：" + oid + ", 当前时间=" + Date + ",收货地址=" + recInfos + ", 我的订单=" + buycart +"]");
	}
	
	////////////////////////////////////////////////////////////////////////
	//pay方法中    for(元素类型t 元素变量x : 遍历对象obj){引用了x的java语句;}
	public void pay() {
		double sum = 0;
		for ( Item item : buycart.getItems()) {
			
			double currprice = item.getAmount()*item.getProduct().getPrice();
			sum += currprice;
			
		}
		System.out.println("总价为："+sum);
	}
	

	public String getOid() {
		return oid;
	}

	

	public void setOid(String oid) {
		this.oid = oid;
	}

	public Date getDate() {
		return Date;
	}

	public void setDate(Date date) {
		Date = date;
	}

	public RecInfo getRecInfos() {
		return recInfos;
	}

	public void setRecInfos(RecInfo recInfos) {
		this.recInfos = recInfos;
	}

	public Buycart getBuycart() {
		return buycart;
	}

	public void setBuycart(Buycart buycart) {
		this.buycart = buycart;
	}
	
	
}
	
	
	
