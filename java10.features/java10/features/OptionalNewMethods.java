package java10.features;

import java.util.Optional;

public class OptionalNewMethods {
	
	
	public static void main(String[] args) {
		
		
		Optional<String> opt=Optional.empty();
		
		//NoSuchElementException
		opt.orElseThrow();
	}
}
