import java.util.LinkedHashMap;
import java.util.Set;

public class Demo 
{
public static void main(String[] args) 
{
LinkedHashMap<Integer, String>	map = new LinkedHashMap<Integer,String>();
map.put(12, "apple");
map.put(13, "samsung");
map.put(14, "Sony");

Set<Integer> keys = map.keySet();
  for(int key : keys)
  {
	System.out.println(key+"-->"+map.get(key));
  }
 }
}
