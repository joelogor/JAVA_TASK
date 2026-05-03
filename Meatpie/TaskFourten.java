import java.util.Scanner;

public class TaskFourten {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("What is the average of:");

        int numberInput1 = input.nextInt();
        int numberInput2 = input.nextInt();
        int numberInput3 = input.nextInt();

        int numberOutput = (numberInput1 + numberInput2 + numberInput3)/3;
        

        System.out.println("The average of " + numberInput1 + " ," + numberInput2 + " and " + numberInput3 + " is " + numberOutput);
    }
}