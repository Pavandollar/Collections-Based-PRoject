package Com.Lastone;

import java.util.ArrayList;
import java.util.TreeSet;

public class Main 
{
	public static void main(String[] args) 
	{
		Country c1= new Country(500,"A");
		Country c2= new Country(502,"B");
		Country c3= new Country(504,"C");
	
		ArrayList <Country> a1 = new ArrayList<Country>();
		
		a1.add(c3);
		a1.add(c2);
		a1.add(c1);
		
		for(Country g : a1)
		{
			System.out.println(g);
		}
		System.out.println();
		
		TreeSet<Country> t1 = new TreeSet<Country>();
	     
		t1.add(c1);
		t1.add(c2);
		t1.add(c3);
		
		for(Country y : t1)
		{
			System.out.println(y);
		}
		
	}

}
