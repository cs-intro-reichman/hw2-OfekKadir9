// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    // Replace this comment with your code
		System.out.println ("pi according to Java: " + Math.PI);
		int numOfTerms = Integer.parseInt(args[0]);
		double terms = 0.0;
		double mechane = 1.0;
		double one = 1.0;
		for (int i = 0; i < numOfTerms ; i++) {
			terms = terms + (one / mechane);
			one = -one;
			mechane = mechane + 2.0;
		}

		double piDivBy4 = terms; 
		double pi = 4.0 * (piDivBy4);
		System.out.println ("pi, approximated:     " + pi);
	}
}
