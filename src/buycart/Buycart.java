package buycart;

import java.util.Arrays;

public class Buycart {
	
	private Item[] items;

	public Item[] getItems() {
		return items;
	}

	@Override
	public String toString() {
		return "Buycart [items=" + Arrays.toString(items) + "]";
	}

	public void setItems(Item[] items) {
		this.items = items;
	}
	
	public void show() {
		for (Item item : items) {
			System.out.println(item);
		}
	}
	

}
