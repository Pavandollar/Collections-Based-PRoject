package DefaultSorting;

public class Hotel implements Comparable<Hotel> 
{
int id;
String name;
Double rating; //Wrapper Class
@Override
public String toString() 
{
	return "Hotel [id=" + id + ", name=" + name + ", rating=" + rating + "]";
}
public Hotel(int id, String name, double rating) 
{
	this.id = id;
	this.name = name;
	this.rating = rating;
}
@Override
public int compareTo(Hotel h) 
{
	return this.id-h.id;
}


}


/**
 * this -> object to be inserted
 * h -> already Existing Object
 * 
 * 
 * Sorting based on id(int or Integer)
 * Asceending Order -> return this.id-h.id;
 * Desecnding Order -> return h.id-this.id;
 * 
 * return this.id.compareTo(h.id)
 * returnh.id.compareTo(this.id)
 * 
 * Sorting based on Name(String)
 * Ascending Order -> return this.name.compareTo(h.name)
 * Descending Order -> return h.name.compareto(this.nam);
 * 
 * Sorting based on ratings(Double)
 * return this.rating.compareTo(h.ratings)
 * return h.rating.compareTo(this.ratings)
 * 
 * never use primitve Data Types in CompareTo method or return Statement
 * 
 * Rules to use Comparable interface
 * 
 * class should implement comparable interface(java.lang package)
 * Specify Generics
 * Override the compareTo() -> public int compareTo(Element e)
 * 
 * 
 */















































