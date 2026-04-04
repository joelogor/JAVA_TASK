import java.util.Scanner;

public class TaskNineteen {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Number:");

        int numberInput = input.nextInt();
        

        int numberOutput = numberInput / 2 ;

        System.out.println( numberInput + " divide "  + " 2 " + " is "  + numberOutput);
    }
}