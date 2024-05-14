import java.util.Scanner;

public class MethodOverloadToMinutes {
   public static int convertTime(int hours) {
      return hours * 60;
   }

   public static int convertTime(int hours, int minutes) {
      return hours * 60 + minutes;
   }

   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int hoursUsed;
      int minutesUsed;
      int totalMinutes1;
      int totalMinutes2;
      
      hoursUsed = scnr.nextInt();
      minutesUsed = scnr.nextInt();
      
      totalMinutes1 = convertTime(hoursUsed);
      System.out.println(hoursUsed + " hours yields " + totalMinutes1 + " minutes.");
      
      totalMinutes2 = convertTime(hoursUsed, minutesUsed);
      System.out.print(hoursUsed + " hours and " + minutesUsed + " minutes yields ");
      System.out.println(totalMinutes2 + " minutes.");
   }
}