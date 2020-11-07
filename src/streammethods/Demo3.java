package streammethods;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Demo3 {

	//reduce()
	
	public static void main(String[] args) {
		
		List<String> stringList = Arrays.asList("A","B","C","1","2","3");
		
		Optional<String>reduced=stringList.stream().reduce((value,combinedvalue)->
								{
									return combinedvalue+value;   
							
									});
		
		System.out.println(reduced.get());

	}

}
