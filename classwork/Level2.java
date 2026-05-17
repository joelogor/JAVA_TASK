import java.util.Scanner;
public class Level2 {

    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    
    int count = 0;
    int number = 0;
    while ( number != 7){
    System.out.println("Enter Number: ");
     number = sc.nextInt();
        if(number <7){
        System.out.println("Below");
        }
        if(number >7){
        System.out.println("Above");
        }
    
    
    }
    System.out.println( number + " equals 7" );
    }
}
    
    
    
