import java.util.ArrayList;
import java.util.Collections;

public class Main2 
{
public static void main(String[] args) 
{
Employee e1 = new Employee(200);
Employee e2 = new Employee(300);
Employee e3 = new Employee(400);

ArrayList<Employee> a = new ArrayList<Employee>();
a.add(e3);
a.add(e2);
a.add(e1);

Collections.sort(a,new Main1());
for(Employee emp : a)
{
	System.out.println(emp);
}
}
}


//Default Sorting _> comparator -> public int compare(Element e1,Element e2),
//1.Create a new class,which implements comparator interface
//2.Import comparator and specify genrics
//3.override compare()
//4.Invoke sort() of collections class by passing list and sorting logic object
