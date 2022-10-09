package in.placement.model;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@RequiredArgsConstructor
@ToString
public class Product {

	@NonNull
	private Integer pid;
	private String pname;
	
}
