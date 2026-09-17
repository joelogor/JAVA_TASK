public class SumArray{

    public static void main(String[] args){
    
        int [] number = {1, 2,3,4,5,6,7,8,9,10};
        
        int count = 0;
        int sum = 0;
        
        for(; count < number.length;count++){
        
            sum = sum + number[count];
        
        }
           System.out.println(sum);
     
    
    }
}

