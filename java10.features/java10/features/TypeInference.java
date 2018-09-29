package java10.features;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class TypeInference {

	
	public static void main(String... args) {
		
		var listString=List.of("String",1,LocalDate.now(),LocalDateTime.now());
		
		listString.stream()
		.filter(e -> e instanceof Integer).forEach(System.out::println);
		
		//lambda java8
		Function<String, String> helloFunction = s -> "Hello " + s; 
		
		//type interence java10
		//diamond interface java7
		
		var printer= new Consumer<String>() {

			@Override
			public void accept(String t) {
				System.out.println(t);
			}

		};
		var myList=List.of(helloFunction.apply("Amor"),helloFunction.apply("Anass"));
		myList.forEach(printer::accept);
	}
}
