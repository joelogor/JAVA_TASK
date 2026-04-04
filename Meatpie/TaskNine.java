import java.util.Scanner;

public class TaskNine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What is your favourite colour:");

        String inputColour = input.nextLine();
        

        String outputColour = inputColour;

        System.out.println("My favourite colour is " +  inputColour );
    }
}