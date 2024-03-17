package DefaultSorting;

import java.util.TreeSet;

public class Solution 
{
public static void main(String[] args) 
{
   Hotel h1=new Hotel(101,"A",4.6);
   Hotel h2=new Hotel(102,"B",4.9);
   Hotel h3=new Hotel(103,"C",3.6);
   
   
   TreeSet <Hotel> t1 = new TreeSet<Hotel>();
   
   t1.add(h1);
   t1.add(h2);
   t1.add(h3);
   
   for(Hotel s : t1)
   {
	   System.out.println(s);
   }
}
}
