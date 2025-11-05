// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    // Replace this comment with your code
		System.out.println ("pi according to java: " + Math.PI);
		int numOfTerms = Integer.parseInt(args[0]);
		double terms = 0;
		int mechane = 3;
		double one = -1;
		for (int i = 0; i < numOfTerms; i++) {
			terms = terms + (one / mechane);
			one = -one;
			mechane = mechane + 2;
		}
		double piDivBy4 = 1 + terms; 
		double pi = 4 * (piDivBy4);
		System.out.println ("pi, approximated:     " + pi);
	}
}
