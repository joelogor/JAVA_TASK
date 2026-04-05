import java.util.Scanner;

public class MinimiumRunawayLength  {

  public static void main(String[] args)  {

   Scanner input = new Scanner(System.in);

System.out.println(" What is the take-off speed:");

double speedInput = input.nextDouble();

System.out.println("What is the acceleration:");

double accelerationInput = input.nextDouble();

double lengthOuput =  (speedInput*speedInput)/(2*accelerationInput);
 
System.out.println("The minimium runaway length needed is " + lengthOuput ); 
 }
}