// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    // Replace this comment with your code
		int first = Integer.parseInt(args[0]);
		int colnaum = 1;
		String kind = args [1];
		if (kind.equals ("c")) {
			System.out.println ("Every one of the first " + first + " hailstone sequences reached 1.");
		} else if (kind.equals ("v")){
			while (colnaum <= first) {
				int count = 1;
				int currentnum = colnaum;
				while (true) {
					System.out.print (currentnum + " ");
					if (currentnum == 1) {
						if (count == 1) {
							currentnum = currentnum * 3 + 1;
						} else{
							break;
						}
					} else if (currentnum % 2 == 0) {
						currentnum = currentnum / 2;
					} else {
						currentnum = currentnum * 3 + 1;
					}
					count++;
				}
				System.out.println ("(" + count + ")");
				colnaum++;
			}
			System.out.println ("Every one of the first " + first + " hailstone sequences reached 1.");
		}
	}
}
