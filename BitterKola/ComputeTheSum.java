  import java.util.Scanner;

public class ComputeTheSum {
   
    public static void main(String[] args)  {

    Scanner input = new Scanner(System.in);

    System.out.println("Enter the 5 digits integers:");

    int inputNumber1 = input.nextInt();
    int inputNumber2 = input.nextInt();
    int inputNumber3 = input.nextInt();
    int inputNumber4 = input.nextInt();
    int inputNumber5 = input.nextInt();
    

    int outputvalue  = inputNumber1 + inputNumber5;

    System.out.println("The sum of first and last digit is  " + outputvalue );
   }
}