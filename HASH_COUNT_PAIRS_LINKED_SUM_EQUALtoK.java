// Java implementation to count pairs from both linked
// lists whose sum is equal to a given value

// Note : here we use java.util.LinkedList for
// linked list implementation

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

class HASH_COUNT_PAIRS_LINKED_SUM_EQUALtoK
{
	// method to count all pairs from both the linked lists
	// whose sum is equal to a given value
	static int countPairs(LinkedList<Integer> head1, LinkedList<Integer> head2, int x)
	{
		int count = 0;
		
		// traverse the 1st linked list
		Iterator<Integer> itr1 = head1.iterator();
		while(itr1.hasNext())
		{
			// for each node of 1st list
			// traverse the 2nd list
			Iterator<Integer> itr2 = head2.iterator();
			Integer t = itr1.next();
			while(itr2.hasNext())
			{
				// if sum of pair is equal to 'x'
				// increment count
				if ((t + itr2.next()) == x)
					count++;
			}
		}
							
		// required count of pairs	
		return count;
	}
	
	// Driver method
	public static void main(String[] args)
	{
		Integer arr1[] = {3, 1, 5, 7};
		Integer arr2[] = {8, 2, 5, 3};
		
		// create linked list1 3->1->5->7
		LinkedList<Integer> head1 = new LinkedList<>(Arrays.asList(arr1));
		
		// create linked list2 8->2->5->3
		LinkedList<Integer> head2 = new LinkedList<>(Arrays.asList(arr2));
		
		int x = 10;
		
		System.out.println("Count = " + countPairs(head1, head2, x));
	}	
}
