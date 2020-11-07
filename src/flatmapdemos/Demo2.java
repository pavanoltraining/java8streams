package flatmapdemos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo2 {

	public static void main(String[] args) {
		
		List<String> teamA = Arrays.asList("Scott", "David", "John");
		List<String> teamB = Arrays.asList("Mary", "Luna", "Tom");
		List<String> teamC = Arrays.asList("Ken", "Jony", "Kitty");
		
		List<List<String>>playersInWorldCup=new ArrayList<List<String>>();
		playersInWorldCup.add(teamA);
		playersInWorldCup.add(teamB);
		playersInWorldCup.add(teamC);
		
		//Before Java8
		/*for(List<String> team:playersInWorldCup)
		{
			for(String name:team)
			{
				System.out.println(name);
			}
		}*/
		
		//using streams flatMap()
		
		List<String> names=playersInWorldCup.stream().flatMap(pList->pList.stream()).collect(Collectors.toList());
		System.out.println(names);
		

	}

}
