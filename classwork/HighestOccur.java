public class HighestOccur {

    public static void main(String[] args){
    int[] numbers = {2,1,2,5,2,4};
    
    int count = 0;
    int highestOccur = 0;
    for(; count< numbers.length; count++){
        if(numbers[0] == numbers[1] && numbers[0] != numbers[2]){
           highestOccur = numbers[0] ; 
        }
            System.out.println(highestOccur);
    }
        
    }

}

