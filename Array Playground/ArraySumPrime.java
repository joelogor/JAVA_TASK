public class ArraySumPrime{

    public static void main(String[] args){
    
    int[] number = {2,3,4,5,6,7,8,9,10,14,17,18};
    int sum = 0;
    int count = 0;
    for(; count < number.length; count++){
        if(number[count] % 2 == 1){
            sum += number[count];
            }
        else if(number[count] % number[count] == 1 ){
            sum += number[count];
        }
        }
    
        System.out.println(sum);
    
    }

}
