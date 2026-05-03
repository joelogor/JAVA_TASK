import java.util.Scanner;

public class MeterToFeet {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("What is the number in meter:");

        double numberInput = input.nextDouble();
        

        double feetOutput = (numberInput * 3.2786);

        System.out.println("The number in feet is  " + feetOutput );
    }
}