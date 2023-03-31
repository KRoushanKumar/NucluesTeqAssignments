import java.util.*;
/**
 * set
 */
public class set {

	public static void main(String[] args) {
		Set<Integer> arr = new HashSet<Integer>();
		int[] numbers  = {4,2,1,5,6,1,5,4,1,5,4,7,8,6,2,5,4};
		int size = numbers.length;
		//System.out.println(size);

		for(int data:numbers)
		{
			arr.add(data);
		}
		System.out.println(arr);
	}
}