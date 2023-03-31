import java.util.*;
class ListUnique {
	public static void main(String args[]) {
	
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(1);
		list.add(2);
		list.add(1);
		list.add(2);
		list.add(1);
		list.add(2);
		list.add(1);
		list.add(2);
		list.add(1);
		
		List<Integer> UniqueList = new ArrayList<Integer>();
		

		Iterator<Integer> it = list.iterator();
		
		System.out.println("Element of List");
		
		while(it.hasNext()) {
			Integer val= it.next();
			if(!UniqueList.contains(val)){
				UniqueList.add(val);
			
			}
				System.out.print(val + " ");
		}
		
		System.out.println("\nUnique Element of List");
		
		Iterator<Integer> uIt = UniqueList.iterator();
		
		while(uIt.hasNext())
		{
			System.out.print( uIt.next() +" ");
		}
		
		
	}
}