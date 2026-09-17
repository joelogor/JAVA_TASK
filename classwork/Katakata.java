import java.util.Scanner;
public class Katakata {

public static void main(String[] args){

int[]numbers = new int[10];
for(int count = 0; count<10;count++){
  Scanner inputCollector = new Scanner(System.in);
  
System.out.println("Enter number:");
int numberInput = inputCollector.nextInt();

numbers[count] = numberInput;

}
for(int count = 0; count<10;count++){
    System.out.print(numbers[count] + " ");


}
} 


}





