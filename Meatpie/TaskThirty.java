import java.util.Scanner;

public class TaskThirty {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("What are the two numbers:");

        double theNumber1 = input.nextDouble();
        double theNumber2 = input.nextDouble();
        
        

        double theOutput1 = theNumber1 + theNumber2;
        double theOutput2 = theNumber1 * theNumber2;
        

        System.out.println("Their sum and product are " + theOutput1 + " and " + theOutput2 );
    }
}