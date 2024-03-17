package Com.Lastone;

public class Country implements Comparable <Country>
{

	int population;
	String name;
	
	@Override
	public String toString() 
	{
		return "Country [population=" + population + ", name=" + name + "]";
	}

	public Country(int population, String name) 
	{
		
		this.population = population;
		this.name = name;
	}

	@Override
	public int compareTo(Country c) 
	{
		
		return c.population-this.population;
	}
}
