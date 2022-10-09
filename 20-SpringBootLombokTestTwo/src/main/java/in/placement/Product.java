package in.placement;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Product {
	
	private Integer pid;

	@Override
	public String toString() {
		return "Product [pid=" + pid + "]";
	}

	
}
