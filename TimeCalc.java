public class TimeCalc {
    public static void main(String[] args) {
        // Replace this comment with your code
        int hours = Integer.parseInt ("" + args [0].charAt(0) + args [0].charAt(1));
        int minutes = Integer.parseInt ("" + args [0].charAt(3) + args [0].charAt(4));
        int minutes2Add = Integer.parseInt(args[1]);
       // System.out.println("Hours: " + hours);
       // System.out.println("Minutes: " + minutes);
       // System.out.println("Minutes to add: " + minutes2Add);
        int newMinutes = ((hours * 60 + minutes + minutes2Add) % 60);
        int newHours = (((hours * 60 + minutes + minutes2Add) / 60) % 24);
        //System.out.println ("New hours: " + newHours);
        //System.out.println ("New minutes: " + newMinutes);
        String newMinuteS = "" + newMinutes;
        String newHourS = "" +  newHours;
        if (newMinutes < 10 ) {
            newMinuteS = "0" +  newMinutes;
        }
        if (newHours < 10 ) {
            newHourS = "0" +  newHours;
        }
        System.out.println (newHourS + ":" + newMinuteS);
    }
}
