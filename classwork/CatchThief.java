import java.util.Scanner;

public class CatchThief {
    public static void main(String[] args) {
        Scanner inputCollector = new Scanner(System.in);
        String name = "";

        
        while (!name.equalsIgnoreCase("thief")) {
            System.out.println("The thief has not been caught.");
            System.out.print("Enter name (type 'thief' to catch them): ");
            name = inputCollector.next(); 
        }

        System.out.print("You caught the thief!");
    }
}
