//feedback

/*
Great work boaz!
*/


// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	    // Replace this comment with your code
            String name = args [0].toUpperCase();
            int numberOfCheers = Integer.parseInt(args[1]);
            int numofLetters = name.length();
            int chartIndex = 0;
            for (int i = 0; i < numofLetters; i++) {
                if (name.charAt(chartIndex) == 'A' || name.charAt(chartIndex) == 'E' || name.charAt(chartIndex) == 'F' ||  name.charAt(chartIndex) == 'H' ||
                    name.charAt(chartIndex) == 'I' || name.charAt(chartIndex) == 'L' || name.charAt(chartIndex) == 'M' || name.charAt(chartIndex) == 'N' ||
                    name.charAt(chartIndex) == 'O' || name.charAt(chartIndex) == 'R' || name.charAt(chartIndex) == 'S' || name.charAt(chartIndex) == 'X') {
                        System.out.println ("Give me an " + name.charAt(chartIndex) + ": " + name.charAt(chartIndex) + "!");
                } else {
                        System.out.println ("Give me a  " + name.charAt(chartIndex) + ": " + name.charAt(chartIndex) + "!");
                }
                chartIndex++;
            }
            System.out.println ("What does that spell?");
            for (int z = 0; z < numberOfCheers; z++) {
                System.out.println (name + "!!!");
            }
        }
}
