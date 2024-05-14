import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.io.IOException;

public class CourseGrade {
   public static void main(String[] args) throws IOException {
      Scanner scnr = new Scanner(System.in);
      
      /* TODO: Declare any necessary variables here. */
      FileInputStream inFileByteStream = null;
      Scanner studentFS = null;
      FileOutputStream outFileByteStream = null;
      PrintWriter fileWriter = null;
      String inFileName = "";
      final String outFileName = "report.txt";
      int score = 0;

      double studentCount = 0;
      double countTotal = 0;
      String lastName = "";
      String firstName = "";
      char grade = 'Z';
      double midTerm1 = 0;
      double midTerm2 = 0;
      double finalTerm = 0;
      int [] personalScore = new int[3];
      int [] midTerm1s = new int[20];
      int [] midTerm2s = new int[20];
      int [] finalTerms = new int[20];
      int i = 0;
      int j = 0;
      
      
      /* TODO: Read a file name from the user and read the tsv file here. */
      inFileName = scnr.next();
      inFileByteStream = new FileInputStream(inFileName);
      studentFS = new Scanner(inFileByteStream);
      outFileByteStream = new FileOutputStream(outFileName);
      fileWriter = new PrintWriter(outFileByteStream);
      
      // Put scores into each student array and test arrays
      while (studentFS.hasNextLine()) {
    	  String line = studentFS.nextLine();
    	  if (line.isEmpty()) {
    		  break;
    	  }
    	  int totalPersonal = 0;
          double averagePersonal = 0;
    	  Scanner lineScanner = new Scanner(line);
	      lastName = lineScanner.next();
	      firstName =  lineScanner.next();
	      fileWriter.print(lastName + "\t" + firstName + "\t");
	      
	      for (i = 0; i < 3; ++i) {
	    	  score = lineScanner.nextInt();
	    	  fileWriter.print(score + "\t");
	    	  personalScore[i] = score; 
	    	  totalPersonal += score;
	    	  if (i == 0) {
	    		  midTerm1s[j]= score;
	    	  }
	    	  else if (i == 1) {
	    		  midTerm2s[j]= score;
	    	  }
	    	  else if (i == 2) {
	    		  finalTerms[j]= score;
	    	  }
	    	  
	      }
	      
		  averagePersonal = (double)totalPersonal / 3;
	      grade = convertToGrade(averagePersonal);
//	      System.out.println(averagePersonal);
//	      System.out.println(lastName);
//	      System.out.println(firstName);
//	      System.out.println(grade);
	      fileWriter.print(grade + "\n");
	      
	      // Go to next line to get next student's information
	      ++j;
      }
      inFileByteStream.close();

      // Calculate average score of midTerm1, midTerm2, finalTerm
      midTerm1 = calculateAverage(midTerm1s);
      midTerm2 = calculateAverage(midTerm2s);
      finalTerm = calculateAverage(finalTerms);
//      System.out.println(midTerm1 );
//      System.out.println(midTerm2);
//      System.out.println(finalTerm);
      
      /* TODO: Compute student grades and exam averages, then output results to a text file here. */
      fileWriter.print("\n" + "Averages: ");
//      fileWriter.print("Midterm1 " + midTerm1 + ", ");
//      fileWriter.print("Midterm2 " + midTerm2 + ", ");
//      fileWriter.print("Final " + finalTerm);
      fileWriter.printf("Midterm1 %.2f, ", midTerm1);
      fileWriter.printf("Midterm2 %.2f, ", midTerm2);
      fileWriter.printf("Final %.2f\n", finalTerm);
      fileWriter.close();

   }
   
   public static char convertToGrade(double average) {
	   char grade = 'Z';
	   if (average < 60) {
		   grade = 'F';
	   }
	   else if (average < 70) {
		   grade = 'D';
	   }
	   else if (average < 80) {
		   grade = 'C';
	   }
	   else if (average < 90) {
		   grade = 'B';
	   }
	   else {
		   grade = 'A';
	   }
	   return grade;
   }
   
   public static double calculateAverage(int [] test) {
	   double average = 0;
	   int sum = 0;
	   int count = 0;
	   for (int i = 0; i < test.length; ++i) {
		   if (test[i] != 0) {
		   sum += test[i];
		   count++;
		   }
	   }
	   average = (double)sum / count;
	   return average;
   }
}