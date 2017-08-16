package buycart;

import java.util.Date;

public class Test01 {

	public static void main(String[] args) {
		
		Product p1 = new Product(1, 10, "iphone");
		Product p2 = new Product(2, 20, "ipad");
		
		Customer c1 = new Customer();
		c1.setId(1);
		c1.setName("tom");
		
		RecInfo rec1 = new RecInfo(1, "neusoft", "jack",true);
		RecInfo rec2 = new RecInfo(2, "tj", "jacklove",false);
		RecInfo[] recInfos = {rec1,rec2};
		c1.setRecInfo(recInfos);
		
		Item item1 = new Item(p1, 2);
		Item item2 = new Item(p2, 6);
		Item[] items = {item1,item2};
		
		Buycart cart1 = new Buycart();
		cart1.setItems(items);
		cart1.show();
		
		long time = System.currentTimeMillis();
		Date date = new Date();
		Orders ord1 = new Orders(String.valueOf(time), date, rec1, cart1);
		ord1.show();
		Orders ord2 = new Orders("2022", date, rec2, cart1);
		ord2.show();
//		System.out.println("price:"+(p1.getPrice()*item1.getAmount()+p2.getPrice()*item2.getAmount()));
		ord1.pay();

	}

}
