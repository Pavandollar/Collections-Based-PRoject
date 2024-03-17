package DefaultSorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class Demo
{
public static void main(String[] args) 
{
TreeSet<Integer> t = new TreeSet<Integer>();
t.add(20);
t.add(30);
t.add(10);

for(int i: t)
{
	System.out.println(i);
}


ArrayList<Integer> l=new ArrayList<Integer>();

l.add(20);
l.add(30);
l.add(10);

Collections.sort(l); // Internally sort() also uses compareto()
for(int i : l)
{
	System.out.println(i);
}

}
}


/**Documentation Comment
 * when you add an object into treeset,internally compareto(gets called
 * return type fo compareto() is int,+1(>)  -1(<)   0(==)
 * Underlined DS -> BinaryTree
 * Traversing Order -> leftnode Parent Node Right Node
 * CompareTO() is present in all Wrapper class and String class
 * when you add an integer object,it calls compareto() present in Integer class like wise for allthe object (String objects,compareTo(),in String class.......)
   * 
*/