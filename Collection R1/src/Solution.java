import java.util.Map;

import java.util.Scanner;
import java.util.Set;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;

public class Solution 
{ 
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		Student s1 = new Student(22,"tom");
		Student s2 = new Student(23,"pom");
		Student s3 = new Student(24,"mom");
		
	Map<Integer,Student> m1 = new LinkedHashMap<Integer, Student>();

	m1.put(100, s1);
	m1.put(200, s2);
	m1.put(300, s3);
	
	
	//getting all the keys from map and storing it it into set
	Set<Integer> keys = m1.keySet();
	
	//traversing the entries(k & V) and printing them
	for(int key : keys )
	{
		System.out.println(key+"-->"+m1.get(key));
	}
    
	//getting all the values(Student Objects) and storing it into arraylist
	
	ArrayList<Student> a1 = new ArrayList<Student>();
	
	for(int key:keys)
	{
		Student std = m1.get(key);
		a1.add(std);//mq1.add(map.get(key));
		
	}
	
	System.out.println("1:Sort based on age\n2.Sort based on name");
	System.out.println("enter choice");
	int choice = sc.nextInt();
	
	switch(choice)
	{
	case 1: Sortby age = new Sortby();
	  Collections.sort(m1,new Sortby());//Collections.sort(m1,new sortby())
	  for(Student s: a1)
	  {
		  System.out.println(s);
	  }
	  break;
	  
	case 2: Collections.sort(1,new Sortby());
	        for(Student s: a1)
	        {
	        	System.out.println(s);
	        }
	        break;
	  
	default : System.out.println("invalid choice");
	}
	sc.close();
	
  }
	

}
/**
 * from the map,get the student object(values) and  
 */




