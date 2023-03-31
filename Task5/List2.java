import java.util.*;
class List2 {
	public static void main(String args[]) {
	
		List<Integer> list = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);		
		int ch=0;
		Integer val;
		
		do
		{
			System.out.println("1. Add");
			System.out.println("2. Remove");
			System.out.println("3. Display");
			System.out.println("4. Exit");
			ch = sc.nextInt();
			switch(ch){
				case 1:
					System.out.print("Enter value:");
					val = sc.nextInt();
					list.add(val);
				break;
					
					
				case 2:
					System.out.print("Enter value to Remove:");
					val = sc.nextInt();
					Iterator<Integer> iit= list.iterator();
					while(iit.hasNext())
					{
						if(iit.next()==val)
						{
							iit.remove();
						}		
					}
					
				break;
				
				case 3:
					Iterator<Integer> it = list.iterator();	
					System.out.println("Element of List");
					while(it.hasNext())
					{
						System.out.print( it.next() +" ");
					}	 
					System.out.print("\n");
					break;
				
				default:
			}
			
			
		}while(ch!=4);
		
		
		sc.close();
		
	}
}