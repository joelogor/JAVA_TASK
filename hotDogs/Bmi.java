import java.util.Scanner;

public class Bmi {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("What is the weight in pounds:");

        double inputWeight = input.nextDouble();

        System.out.println("What is the the height in inches:");
        
        double inputHeight = input.nextDouble();

        

        double outputValue = (inputWeight/0.5359237)/(inputHeight/0.0254);


        System.out.println("The BMI is " + outputValue );
    }
}