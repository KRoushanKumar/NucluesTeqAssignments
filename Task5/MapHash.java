import java.util.*;
public class MapHash {

	public static void main(String[] args) {
		Map<Character,Integer> m1 = new HashMap<Character,Integer>();
		Map<Integer,Integer> m2 = new HashMap<Integer,Integer>();
		
		int num1[]={1,2,5,6,9,8,5,6,3,2,5,4,1,2,5,8,7,4,5,5,2,1};
		char charArray[]={'a','b','c','a','b','c','a','b','c','e','t'};
		
		for(int val : num1)
		{
			if(m2.containsKey(val))
			{
				//int v=m2.get(val)+1;
				m2.put(val,m2.get(val)+1);
			}
			else
				m2.put(val,1);
		}
		for(char ch : charArray)
		{
			if(m1.containsKey(ch))
			{
				m1.put(ch,m1.get(ch)+1);
			}
			else
				m1.put(ch,1);
		}
		
		System.out.println(m2);
		System.out.println(m1);
	}
}