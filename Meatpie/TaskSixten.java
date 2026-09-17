import java.util.Scanner;

public class TaskSixten {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Number:");

        int numberInput = input.nextInt();
        

        int numberOutput = numberInput * 5 ;

        System.out.println( numberInput + " multiply " + " by " + " 5 " + " is "  + numberOutput);
    }
}