import java.util.Scanner;

public class AveragePositiveNumber {

  public static void main(String[] args) {
   
  Scanner inputCollector = new Scanner(System.in);
  
  int sumPositiveNumber =0;
  int count = 0;
System.out.println("Enter positive numbers and enter negative number to stop:");

  while (true) {
	int positiveNumber = inputCollector.nextInt();

        if (positiveNumber < 0){
	    break;
}

	if (positiveNumber > 0){

sumPositiveNumber += positiveNumber;
		count++;
  }

}
  double averageNumber = (double)sumPositiveNumber/count;

  System.out.println("The average of positive numbers is " + averageNumber);
}

    
}