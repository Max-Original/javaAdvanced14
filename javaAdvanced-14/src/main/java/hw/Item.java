package hw;

import java.util.HashSet;
import java.util.Set;

public class Item {

	private Integer id;
	private String total;
	private Set<Cart> carts = new HashSet();
	
	public Item() {}

	public Item(String total) {
		super();
		this.total = total;
	
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTotal() {
		return total;
	}

	public void setTotal(String total) {
		this.total = total;
	}

	public Set<Cart> getCarts() {
		return carts;
	}

	public void setCarts(Set<Cart> carts) {
		this.carts = carts;
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", total=" + total + ", carts=" + carts + "]";
	}
	
	
}
