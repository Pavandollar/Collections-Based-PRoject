package DefaultSorting;

import java.util.ArrayList;


public class Main 
{
	public static void main(String[] args) 
	{
	   Hotel h1=new Hotel(101,"A",4.6);
	   Hotel h2=new Hotel(102,"B",4.9);
	   Hotel h3=new Hotel(103,"C",3.6);
	   
	   
	   ArrayList <Hotel> a1 = new ArrayList<Hotel>();
	   
	   a1.add(h1);
	   a1.add(h2);
	   a1.add(h3);
	   
	   for(Hotel s : a1)
	   {
		   System.out.println(s);
	   }
	}

}
