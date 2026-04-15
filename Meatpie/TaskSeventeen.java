import java.util.Scanner;

public class TaskSeventeen {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Number:");

        int numberInput = input.nextInt();
        

        int numberOutput = numberInput + 10 ;

        System.out.println( numberInput + " plus "  + " 5 " + " is "  + numberOutput);
    }
}