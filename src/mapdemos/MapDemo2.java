package mapdemos;

import java.util.Arrays;
import java.util.List;

public class MapDemo2 {

	public static void main(String[] args) {
	
		List<String> vehicles = Arrays.asList("bus", "car", "bicycle", "flight", "train");
		
		
		//before java8/without using streams
		/*for(String name:vehicles)
		{
			System.out.println(name.length());
		}*/
		
		
		//using streams
		
		//vehicles.stream().map(vname->vname.length()).forEach(len->System.out.println(len));
		
		vehicles.stream().map(vname->vname.length()).forEach(System.out::println);
		
	}

}
