package streamsmethods2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Student 
{
    String name;
    int score;

    public Student(String name, int score)
    {
        this.name = name;
        this.score = score;
    }

    
    public String getName()
    {
        return this.name; 
    }

    public int getScore()
    {
        return this.score;
    }
   
}

public class ParallelStreamsDemo {

	public static void main(String[] args) {
		 List<Student> studentList = new ArrayList<>();

	    studentList.add(new Student("David", 82));
	    studentList.add(new Student("Bob", 90));
	    studentList.add(new Student("John", 67));
	    studentList.add(new Student("Canedy", 80));
	    studentList.add(new Student("Eric", 55));
	    studentList.add(new Student("Smith", 49));
	    studentList.add(new Student("Mary", 88));
	    studentList.add(new Student("Henry", 98));
	    studentList.add(new Student("Scott", 66));
		    
	    //Ex1 : with Single stream
	    studentList.stream().filter(s -> s.getScore() >= 80)
	    							.limit(3)
	    							.forEach(stu->System.out.println(stu.getName()+"  "+stu.getScore()));
	    
	    

	        
	    //Ex2 : with Parallel stream2
	    studentList.parallelStream().filter(s -> s.getScore() >= 80)
	    							.limit(3)
	    							.forEach(stu->System.out.println(stu.getName()+"  "+stu.getScore()));
	    
	    
	    //Ex3 : with Parallel stream2
	    studentList.stream().parallel().filter(s -> s.getScore() >= 80)
							.limit(3)
							.forEach(stu->System.out.println(stu.getName()+"  "+stu.getScore()));
	    
	    
	}

}
