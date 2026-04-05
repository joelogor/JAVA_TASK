import java.util.Scanner;

public class DistanceCovered {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("What is the initial velocity:");

        double velocityInput = input.nextDouble();

        System.out.println("What is the the time:");
        
        double timeInput = input.nextDouble();
        
         System.out.println("What is the the acceleration:");
         
         double accelerationInput = input.nextDouble();

        

        double distanceOutput = velocityInput* timeInput + ((accelerationInput*timeInput*timeInput)/2);


        System.out.println("The distance returned is equal to " + distanceOutput );
    }
}