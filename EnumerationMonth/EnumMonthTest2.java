import java.util.Scanner;
/**
 * EnumMonthTest2
 * 
 * @Celine Wang
 * @1/20/23
 */
public class EnumMonthTest2{
    public static void main(String[] args){
        int monthNum = 0;
        Month2 monthEnum = Month2.JAN;
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
            case 1: monthEnum = Month2.JAN; break;
            case 2: monthEnum = Month2.FEB; break;
            case 3: monthEnum = Month2.MAR; break;
            case 4: monthEnum = Month2.APR; break;
            case 5: monthEnum = Month2.MAY; break;
            case 6: monthEnum = Month2.JUN; break;
            case 7: monthEnum = Month2.JUL; break;
            case 8: monthEnum = Month2.AUG; break;
            case 9: monthEnum = Month2.SEP; break;
            case 10: monthEnum = Month2.OCT; break;
            case 11: monthEnum = Month2.NOV; break;
            case 12: monthEnum = Month2.DEC; break;
            default: System.out.print("That was not a valid month. Try running the program again.");
                System.exit(2);
        }

        System.out.println("The month is " + monthEnum.getMonth());
    }
}

