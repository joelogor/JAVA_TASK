import java.util.Scanner;

  public class AccountValue  {

    public static void main(String[] args)   {

    Scanner input = new Scanner(System.in);
   
    System.out.println("What is the monthly savings:");
   
    double inputSaving = input.nextDouble();

    double outputValue  = inputSaving* (6/12) +inputSaving;

    System.out.println("The value of the account after each of the first six month is " + outputValue);
   }
}