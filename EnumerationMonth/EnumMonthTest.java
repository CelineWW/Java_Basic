import java.util.Scanner;
/**
 * EnumMonthTest
 * 
 * @Celine Wang
 * @1/20/23
 */
public class EnumMonthTest{
    public static void main(String[] args){
        int monthNum = 0;
        Month monthEnum = Month.JAN;
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a numeric month (1-12): ");
        if(in.hasNextInt()){
            monthNum = in.nextInt();
        }
        else {
            System.out.println("That was not a numerica entry. Try running the program again.");
            System.exit(1);
        }

        switch(monthNum) {
            case 1: monthEnum = Month.JAN; break;
            case 2: monthEnum = Month.FEB; break;
            case 3: monthEnum = Month.MAR; break;
            case 4: monthEnum = Month.APR; break;
            case 5: monthEnum = Month.MAY; break;
            case 6: monthEnum = Month.JUN; break;
            case 7: monthEnum = Month.JUL; break;
            case 8: monthEnum = Month.AUG; break;
            case 9: monthEnum = Month.SEP; break;
            case 10: monthEnum = Month.OCT; break;
            case 11: monthEnum = Month.NOV; break;
            case 12: monthEnum = Month.DEC; break;
            default: System.out.print("That was not a valid month. Try running the program again.");
                System.exit(2);
        }

        switch(monthEnum) {
            case JAN: System.out.println("The month is January."); break;
            case FEB: System.out.println("The month is Feburay."); break;
            case MAR: System.out.println("The month is March"); break;
            case APR: System.out.println("The month is April"); break;
            case MAY: System.out.println("The month is May"); break;
            case JUN: System.out.println("The month is June"); break;
            case JUL: System.out.println("The month is July"); break;
            case AUG: System.out.println("The month is August"); break;
            case SEP: System.out.println("The month is September"); break;
            case OCT: System.out.println("The month is October"); break;
            case NOV: System.out.println("The month is November"); break;
            case DEC: System.out.println("The month is December"); break;
        }
    }
}

