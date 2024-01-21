/**
 * EnumTest1 runs a simple program as an example of using an enum in a switch statement.
 * 
 * @author Merrill Hall
 * @version 1.0
 */
public class EnumTest1 {
    public static void main(String[] args) {
        DayOfWeek day = DayOfWeek.MONDAY;
        howsYourDay(day);
        day = DayOfWeek.WEDNESDAY;
        howsYourDay(day);
        day = DayOfWeek.FRIDAY;
        howsYourDay(day);
        day = DayOfWeek.SATURDAY;
        howsYourDay(day);
        day = DayOfWeek.SUNDAY;
        howsYourDay(day);

        DayOfWeek day1 = DayOfWeek.SATURDAY;
        DayOfWeek day2 = DayOfWeek.SUNDAY;
        if (day1.compareTo(day2) < 0)
            System.out.println(day1 + " comes before " + day2);
        else if (day1.compareTo(day2) > 0)
            System.out.println(day1 + " comes after " + day2);
        else
            System.out.println(day1 + " and " + day2 + " are the same");

        if (day1.compareTo(day2) < 0)
            System.out.println(day1 + " comes before " + day2);
        else if (day1.compareTo(day2) > 0)
            System.out.println(day1 + " comes after " + day2);
        else
            System.out.println(day1 + " and " + day2 + " are the same");
    }

    public static void howsYourDay(DayOfWeek day) {
        switch (day) {
            case SUNDAY:
            case SATURDAY:
                System.out.println("It's " + day + "!  It's the weekend! Hooray!");
                break;
            case MONDAY:
                System.out.println("It's " + day + ". I'm sorry!");
                break;
            case FRIDAY:
                System.out.println("It's " + day + "! Only one day to go!");
                break;
            case WEDNESDAY:
                System.out.println("It's " + day + "! You're halfway there!");
                break;
            case TUESDAY:
            case THURSDAY:
                System.out.println("It's " + day + ". Nothing special about today.");
                break;
        }
        System.out.println();
    }
}