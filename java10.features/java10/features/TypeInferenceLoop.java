package java10.features;

import java.util.ArrayList;
import java.util.List;

public class TypeInferenceLoop {
	public static void main(String[] args) {
		//java7
		List<Integer> list=new ArrayList<>();
		
		//java 10
		for (var i = 0; i < 10; i++) {
			list.add(1);
		}
		
		for (var integer : list) {
			
		}
	}
}
