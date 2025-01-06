//calling the method calculateGrade in the main method
public class GradeCalculator
{	
	public static void main(String[] args) {
		calculateGrade();
		
	}
//creating method called calculateAssignment with 3 assignment parameters (variables)
	public static double calculateAssignment( double asst1,double asst2,double asst3){;
//creating variable called avgAsst to input average of 3 assignments
		double avgAsst =(asst1 +  asst2 + asst3)/3;
		return avgAsst;
		
	}
//creating method called calculateQuiz with 3 quiz parameters (variables)
	public static double calculateQuiz (double quiz1,double quiz2,double quiz3) {;
//Finding minumum of quiz 1 and quiz 2 with the max min method and putting it in a variable called minimum1
		double minimum1 = (Math.min(quiz1,quiz2));
//Finding minumum of minimum1 and quiz 3 with the max min method and putting it in a variable called minimum2
		double minimum2 = (Math.min(minimum1,quiz3));
// Adding quiz 1,quiz 2,quiz 3 and substracting that sum with minimum2 to find and drop the lowest quiz grade
//Putting that equation in a variable called sum
		double sum =((quiz1 + quiz2 + quiz3)- minimum2);
//Creating a variable called avgQuiz to input the average of the 2 highest quizes
		double avgQuiz = sum/2;
		return avgQuiz;
	}
//Creating method called calculateTotal with 4 parameters (variables) of the average assignment, average quiz, midterm grade and final grade
	public static double calculateTotal (double avgAsst, double avgQuiz, double midTerm, double Final) {;
//Creating 4 new variables similar to the parameters but making them weighted by percentages 
		double wAvgAsst = (avgAsst*0.30);
		double wAvgQuiz = (avgQuiz*0.05);
		double wMidTerm = (midTerm*0.25);
		double wFinal = (Final*0.40);
//Creating variable called wTotal with the sum of the 4 previous variables
		double wTotal = (wAvgAsst + wAvgQuiz + wMidTerm + wFinal);
		return wTotal;
	}
//Creating method called calculateGrade
	public static void calculateGrade() {
		java.util.Scanner reader = new java.util.Scanner(System.in);
//creating variables of all the assignments and quizes along with the midterm and final
		double asst1;
		double asst2;
		double asst3;
		double quiz1;
		double quiz2;
		double quiz3;
		double midTerm;
		double Final;
//Printing so that when compilling, it will say that
		System.out.println ("Please input you grade on assignment 1: ");
// your are able to insert a number when reader.nextDouble
		asst1 = reader.nextDouble();
//Printing so that when compilling, it will say that
		System.out.println ("Please input you grade on assignment 2: ");
// your are able to insert a number when reader.nextDouble
		asst2 = reader.nextDouble();
//Printing so that when compilling, it will say that
		System.out.println ("Please input you grade on assignment 3:");
// your are able to insert a number when reader.nextDouble
		asst3 = reader.nextDouble();
//Printing so that when compilling, it will say that
		System.out.println ("Please input you grade on quiz 1: ");
// your are able to insert a number when reader.nextDouble
		quiz1 = reader.nextDouble();
//Printing so that when compilling, it will say that
		System.out.println ("Please input you grade on quiz 2: ");
// your are able to insert a number when reader.nextDouble
		quiz2 = reader.nextDouble();
//Printing so that when compilling, it will say that
		System.out.println ("Please input you grade on quiz 3: ");
// your are able to insert a number when reader.nextDouble
		quiz3 = reader.nextDouble();
//Printing so that when compilling, it will say that
		System.out.println ("Please input you grade on the midterm: ");
// your are able to insert a number when reader.nextDouble
		midTerm = reader.nextDouble();
//Printing so that when compilling, it will say that
		System.out.println ("Please input you grade on the final: ");
// your are able to insert a number when reader.nextDouble
		Final = reader.nextDouble();
//putting the called method in a variable so that the calculation will be remembered since current method doesn't know how to do calculation
		double avgAsst = calculateAssignment(asst1,asst2,asst3);
//putting the called method in a variable so that the calculation will be remembered since current method doesn't know how to do calculation
		double avgQuiz = calculateQuiz(quiz1,quiz2,quiz3);
//putting the called method in a variable so that the calculation will be remembered since current method doesn't know how to do calculation
		double wTotal = calculateTotal(avgAsst,avgQuiz,midTerm,Final);
//Printing so that when compiling it will say that and answer the question
		System.out.println ("Your assignment average is: " + avgAsst);
//Printing so that when compiling it will say that and answer the question
		System.out.println ("Your quiz average (after dropping the lowest) is: " + avgQuiz);
//Printing so that when compiling it will say that and answer the question
		System.out.println ("Your weighted average is: " + wTotal);
//Creating a variable called maximum and using the math max method to find highest between final and weighted total
		double maximum = (Math.max(Final,wTotal));
//Printing the final final grade so that when compiling it will say that and answer the question
		System.out.println ("Your final grade is: " + maximum);

	}	
}


		