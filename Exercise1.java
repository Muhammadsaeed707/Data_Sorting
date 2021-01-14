package HW2;

//Exercise 1 has run time of O(n)
public class Exercise1 {
	public static int Reverse(String one, String two) {
		//make string lower case and replace spaces
		String low1 = one.toLowerCase();
		String low2 = two.toLowerCase();
		String a = low1.replaceAll("\\s",  "");
		String b = low2.replaceAll("\\s",  "");
		//find length and set variable same to 0
		int blen = b.length() - 1;
		int same = 0;
		//if length not same then can't work
		if (a.length() != b.length()) {
			return 0;
		}
		//if the characters are same then increment same
		else {
			for (int i = 0; i < a.length(); i++) {
				if(a.charAt(i) == b.charAt(blen)) {
					same += 1;
				}
				blen -=1;
			}
			if (same == a.length()) {
				return 1;
			}
			else {
				return 0;
			}
		}
	}	
	
	public static void main (String[] args) {
		System.out.println(Reverse("Goo gle", "elgo og"));
		System.out.println(Reverse("data", "ata"));
	}
}
