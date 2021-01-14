package HW2;

import java.util.ArrayList;

//Exercise 1 has run time of O(n)
public class Exercise2 {
	public static String Shortest(String s) {
		//split and add to arraylist
		ArrayList<String> str = new ArrayList<String>();
		String[] spl = s.split(" ");
		for (int i = 0; i < spl.length; i++) {
			str.add(spl[i]);
		}
		//set variables
		String total = "";
		String small;
		// sort through the list and compare each set of three
		for (int i = 0; i < str.size(); i+=3) {
			if (str.get(i).length() <= str.get(i+1).length()) {
				small = str.get(i);
			}
			else {
				small = str.get(i+1);
			}
			if (str.get(i+2).length() < small.length()) {
				small = str.get(i+2);
			}
			total += (small + " ");
		}
		return total;
	}

	
	public static void main (String[] args) {
		System.out.println(Shortest("Other entries include a historic district in Charlottesville Virginia cut-flower greenhouse complex"));
	}
}
