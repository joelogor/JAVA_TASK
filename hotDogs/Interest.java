import java.util.Scanner;

  public class Interest {
   
    public static void main(String[] args)  {

    Scanner input = new Scanner(System.in);

    System.out.println("What is the balance:");

    double inputBalance = input.nextDouble();

    System.out.println("What is the annual percentage interest:");

    double inputAnnualRate =  input.nextDouble();

    double outputValue  =  (inputAnnualRate/1200)*inputBalance;

    System.out.println("The intrest for the next month is " + outputValue );
   }
}