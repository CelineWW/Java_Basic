
/* Work with Review Class */
//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class ReviewSystem {
// 
//   public static void main(String [] args) {
//      Scanner scnr = new Scanner(System.in);
//      ArrayList<Review> reviewList = new ArrayList<Review>();
//      Review currReview;
//      int currRating;
//      String currComment;
//      int i;
//   
//      System.out.println("Type rating + comments. To end: -1");
//      currRating = scnr.nextInt();
//      while (currRating >= 0) {
//         currReview = new Review();
//         currComment = scnr.nextLine(); // Gets rest of line
//         currReview.setRatingAndComment(currRating, currComment);
//         reviewList.add(currReview);
//         currRating = scnr.nextInt();
//      }
//   
//      // Output all comments for given rating
//      System.out.println();
//      System.out.println("Type rating. To end: -1");
//      currRating = scnr.nextInt();
//      while (currRating != -1) {
//         for (i = 0; i < reviewList.size(); ++i) {
//            currReview = reviewList.get(i);
//            if (currRating == currReview.getRating()) {
//               System.out.println(currReview.getComment());
//            }
//         }
//         currRating = scnr.nextInt();
//      }
//   }
//}



/* Work with Review and Reviews Class */
import java.util.ArrayList;
import java.util.Scanner;

public class ReviewSystem {
 
   public static void main(String [] args) {
      Scanner scnr = new Scanner(System.in);
      Reviews allReviews = new Reviews();
      String currName;
      int currRating;
   
      System.out.println("Type rating + comments. To end: -1");
      allReviews.inputReviews(scnr);
   
      System.out.println("\nAverage rating: ");
      System.out.println(allReviews.getAverageRating());
   
      // Output all comments for given rating
      System.out.println("\nType rating. To end: -1");
      currRating = scnr.nextInt();
      while (currRating != -1) {
         allReviews.printCommentsForRating(currRating);
         currRating = scnr.nextInt();
      }
   }
}
