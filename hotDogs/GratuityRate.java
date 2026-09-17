import java.util.Scanner;

public class GratuityRate {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("What is the the subtotal:");

        double subtotalInput = input.nextDouble();

        System.out.println("What is the the gratuity rate:");
        
        double gratuityRateInput = input.nextDouble();

        

        double gratuityOutput = subtotalInput * (gratuityRateInput/100);

        double totalOutput = subtotalInput + gratuityOutput;


        System.out.println("The gratuity is $" + gratuityOutput + " and the totatal is $" + totalOutput );
    }
}