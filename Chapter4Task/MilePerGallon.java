import java.util.Scanner;

public class MilePerGallon {

public static void main(String[] args) {

Scanner inputCollector = new Scanner(System.in);
System.out.println("Enter miles completed:");
int mile = inputCollector.nextInt();
System.out.println("Enter gallons used:");
int gallon = inputCollector.nextInt();

float result = (float)mile/gallon;
System.out.println("The miles per gallon obtained for each trip is " + result + "MpG");


}

}
