/**
 * quw
 */
import java.util.*;
public class quw {

	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<Integer>();
		
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		q.add(5);
		q.add(6);
		
		int size=q.size();
		
		System.out.println(size);
		System.out.println(q);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of elements to reverse");
		int n = sc.nextInt();
		
	}
}
		
		
		