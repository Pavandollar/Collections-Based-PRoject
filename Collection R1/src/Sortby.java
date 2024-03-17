import java.util.Comparator;

public class Sortby  implements Comparator<Sort>
{

	@Override
	public int compare(Sort x, Sort y) 
	{
		// TODO Auto-generated method stub
		return x.age-y.age; 
	}

}
