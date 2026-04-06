import java.util.Scanner;

  public class SideOfRightAngleTriangle {
   
    public static void main(String[] args)  {

    Scanner input = new Scanner(System.in);

    System.out.println("What is the the side of two legs:");

    double inputLeg1 = input.nextDouble();
    double inputLeg2 = input.nextDouble();


    double outputHypotenuse  = Math.pow(inputLeg1,2)+ Math.pow(inputLeg2,2);

    System.out.println("The hypotenise is " + outputHypotenuse );
   }
}