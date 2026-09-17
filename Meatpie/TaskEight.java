import java.util.Scanner;

public class TaskEight {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What is the cube of:");

        int cubeInput = input.nextInt();
        

        int cubeOutput = cubeInput * cubeInput * cubeInput;

        System.out.println("The cube of " + cubeInput + " is " + cubeOutput );
    }
}