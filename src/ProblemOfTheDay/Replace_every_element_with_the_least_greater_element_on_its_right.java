package ProblemOfTheDay;

import java.util.*;

public class Replace_every_element_with_the_least_greater_element_on_its_right {

	public static ArrayList<Integer> findLeastGreater(int n, int[] arr) {
		// code here
		TreeSet<Integer> set = new TreeSet<>();
		ArrayList<Integer> list = new ArrayList<>();

		for (int i = n - 1; i >= 0; i--) {
			set.add(arr[i]);

			Integer next = set.higher(arr[i]);
			if (next != null)
				list.add(next);
			else
				list.add(-1);
		}

		Collections.reverse(list);
		return list;
	}

}
