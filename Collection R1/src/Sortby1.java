import java.util.Comparator;

public class Sortby1 implements Comparator<Sort>
{

	@Override
	public int compare(Sort x1, Sort y1) 
	{
		// TODO Auto-generated method stub
		return x1.name.compareTo(y1.name);
	}

}
