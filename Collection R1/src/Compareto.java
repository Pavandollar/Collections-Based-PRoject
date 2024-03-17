
public class Compareto 
{
	public static void main(String[] args) 
	{
	  String x = "A";
	  String y = "B";
	  System.out.println(x.compareTo(y));//"A.Compareto("B")
	  System.out.println(y.compareTo(x));//"B".Compareto("A");
	  System.out.println(x.compareTo(x));//"A".Compareto("A");
	  
	  }

}

/**
Compareto() is present i all wrapper class and string class
in order to compare string oject we need to call compareto() of string class
Syntax:public int compareto(E e)
return +1 when it is >-> RHS
return -1 when it is < -> LHS
return o when it is == -> Discard*/