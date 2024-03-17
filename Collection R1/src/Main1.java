import java.util.Comparator;

public class Main1 implements Comparator<Employee>
{
 public int compare(Employee x,Employee y)
 {
	 return x.id-y.id;
 }
}

//x-> object to be inserted 
//and y--> already existed
