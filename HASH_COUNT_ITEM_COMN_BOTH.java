// Java implementation to count
// items common to both the lists
// but with different prices
import java.util.*;
class COUNT_ITEM_COMN_BOTH {

	// details of an item
	static class item {
		String name;
		int price;
		public item(String name, int price)
		{
			this.name = name;
			this.price = price;
		}
	};

	// function to count items common to both
	// the lists but with different prices
	static int countItems(item list1[], int m, item list2[],
						int n)
	{
		// 'um' implemented as hash table that contains
		// item name as the key and price as the value
		// associated with the key
		HashMap<String, Integer> um = new HashMap<>();
		int count = 0;

		// insert elements of 'list1' in 'um'
		for (int i = 0; i < m; i++)
			um.put(list1[i].name, list1[i].price);

		// for each element of 'list2' check if it is
		// present in 'um' with a different price
		// value
		for (int i = 0; i < n; i++)
			if ((um.containsKey(list2[i].name))
				&& (um.get(list2[i].name)
					!= list2[i].price))
				count++;

		// required count of items
		return count;
	}

	// Driver program to test above
	public static void main(String[] args)
	{
		item list1[] = { new item("apple", 60),
						new item("bread", 20),
						new item("wheat", 50),
						new item("oil", 30) };
		item list2[]
			= { new item("milk", 20), new item("bread", 15),
				new item("wheat", 40),
				new item("apple", 60) };

		int m = list1.length;
		int n = list2.length;

		System.out.print("Count = "
						+ countItems(list1, m, list2, n));
	}
}


