package ch02MeaningfulName;

import java.util.ArrayList;
import java.util.List;

public class NamingEx01 {
	// Q1 : What is in 'theList'?
	// Q2 : Why is the 0th value in 'theList' important?
	// Q3 : What does value 4 mean?
	// Q4 : How do I use list1 returned by the function?
	public List<int[]> getThem(List<int[]> theList) {
		List<int[]> list1 = new ArrayList<int[]>();

		for (int[] x : theList) {
			if (x[0] == 4) {
				list1.add(x);
			}
		}
		
		return list1;
	}
}
