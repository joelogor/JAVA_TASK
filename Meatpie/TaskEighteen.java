import java.util.Scanner;

public class TaskEighteen {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Number:");

        int numberInput = input.nextInt();
        

        int numberOutput = numberInput - 5 ;

        System.out.println( numberInput + " minus "  + " 5 " + " is "  + numberOutput);
    }
}