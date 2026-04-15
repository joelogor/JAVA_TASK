import java.util.Scanner;

public class NewPopulation {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("What is the number of years:");

        double yearsInput = input.nextDouble();
        

        double populationOutput = 31536000 + (2780097*yearsInput);

        System.out.println("The new population after " + yearsInput + " is " + populationOutput );
    }
}