import java.util.Scanner;

public class MileToKilometerConveter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What is the kilometer of :");

        double mileInput = input.nextDouble();
        

        double kilometerOutput = mileInput * 1.6;

        System.out.println("The kilometer of " + mileInput + " is " + kilometerOutput + "km" );
    }
}