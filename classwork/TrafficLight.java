
import java.util.Scanner;
public class TrafficLight{

    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter colour : ");
    String colour = sc.nextLine();
    if (colour.equalsIgnoreCase("Green")){
        System.out.print("GO");
    
    }
    else if (colour.equalsIgnoreCase("yellow")){
        System.out.println("Get Ready");
    }
    
    
   else if (colour.equalsIgnoreCase(" red ")){
        System.out.println("Stop");
    }
    
    else{
    
        System.out.println("Input Uknown");
    }

    }

}
