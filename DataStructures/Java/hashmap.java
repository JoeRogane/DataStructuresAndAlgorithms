import java.util.*;

class HashMapDemo
{

	static void check(String s)
	{
		HashMap<Character,Integer> map=new HashMap<Character,Integer>();
		for(int i=0;i<s.length();i++)
			{char c=s.charAt(i);
			 if(!map.containsKey(c))
				map.put(c,1);
			 else
				map.put(c,map.get(c)+1);
			}
			
		
		
		Iterator<Character> itr = map.keySet().iterator();
		while (itr.hasNext()) {
			Object x=itr.next();
			System.out.println("count of "+x+" : "+map.get(x));
		}
	}
	
	public static void main(String[] args)
	{
		String s="hello";
		check(s);
	}
}
