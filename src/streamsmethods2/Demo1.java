package streamsmethods2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//sorted
public class Demo1 {

	public static void main(String[] args) {
		
		List<Integer> list1=Arrays.asList(2,4,1,3,7,5,9);
		List<Integer> sortedlist=list1.stream().sorted().collect(Collectors.toList());
		
		System.out.println(sortedlist); //ascendign order
		
		List<Integer> reversesortedlist=list1.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		
		System.out.println(reversesortedlist);//descendign order/reverse
		
		//Strings
		
		List<String> list2=Arrays.asList("John","Mary","Kim","David","Smith");
			
		List<String> sortedlist2=list2.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedlist2);
		
		List<String> reversesortedlist2=list2.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(reversesortedlist2);
	}

}
