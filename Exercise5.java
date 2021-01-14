package HW2;

public class Exercise5 {
	static int same = 0;
	public static int pal(String s, int fir, int las) {
		//set base case
		if ((fir == las) || (same == s.length()/2)) {
			return 1;
		}
		//if first and last same then increment both and try again
		if(s.charAt(fir) == s.charAt(las)) {
			same += 1;
			return pal(s, fir+1, las-1);
		}
		return 0;
	}
	
	public static void main(String[] args) {
		String s = "radar";
		int fir = 0; 
		int las = s.length()-1;
		System.out.println(pal(s, fir, las));
	}
}
