import java.util.Scanner;

public class RatingList {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
		double rating1;
		double rating2;
		double rating3;
		double rating4;
      int i;

		rating1 = scnr.nextDouble();
		rating2 = scnr.nextDouble();
		rating3 = scnr.nextDouble();
		rating4 = scnr.nextDouble();

      double[] userRating = new double[4];
      userRating[0] = rating4;
      userRating[1] = rating3;
      userRating[2] = rating2;
      userRating[3] = rating1;

      System.out.print("Ratings: ");
      for (i = 0; i < userRating.length; ++i) {
         System.out.print(userRating[i] + " ");
      }
      System.out.println();
   }
}