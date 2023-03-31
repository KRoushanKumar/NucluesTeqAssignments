import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Queue<Integer> q  = new LinkedList<Integer>();
		Queue<Integer> temp = new LinkedList<Integer>();
		Stack<Integer> s = new Stack<Integer>();
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
		
		for(int i=0;i<n;i++)
		{
			s.push(q.peek());
			q.remove();
		}
		
		while(q.size()>0)
		{
			temp.add(q.peek());
			q.remove();
		}
		
		while(s.size()>0)
		{
			q.add(s.peek());
			s.pop();
		}
		
		while(temp.size()>0)
		{
			q.add(temp.peek());
			temp.remove();
		}
		
		while(q.size()>0)
		{
			System.out.print(q.peek()+" ");
			q.remove();
		}
		
	}
}
