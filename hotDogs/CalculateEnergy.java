import java.util.Scanner;

public class CalculateEnergy {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("What is the amount of water in kilogram:");

        double waterInput = input.nextDouble();

        System.out.println("What is the the initial temperature:");
        
        double temperatureInput1 = input.nextDouble();
        
         System.out.println("What is the the final temperature:");
         
         double temperatureInput2 = input.nextDouble();

        

        double energyOutput = waterInput* 4184 * (temperatureInput2-temperatureInput1);


        System.out.println("The energy needed to heat water from an initial to final temperature is " + energyOutput );
    }
}