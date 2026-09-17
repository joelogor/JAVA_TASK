import java.util.Scanner;

public class ArrayReverse {
    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    int []number = new int[10];
    int index = 0;
    while(index < number.length){
    number[index] = sc.nextInt();
    
    
        index++;
    }    
    for(int count = number.length-1; count >= 0;count--){
    System.out.print(number[count]);
    }
    }
}
