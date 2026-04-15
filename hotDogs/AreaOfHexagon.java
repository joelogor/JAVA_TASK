import java.util.Scanner;

  public class AreaOfHexagon {
   
    public static void main(String[] args)  {

    Scanner input = new Scanner(System.in);

    System.out.println("What is the side:");

    double inputSide = input.nextDouble();

    double outputArea = (Math.cbrt(3))/2 * (inputSide*inputSide);


    System.out.println("The area of the Hexagon is " + outputArea );
   }
}