import java.util.Scanner;
public class PrimeNumber{


    
    public static boolean isPrime(int number){
        boolean prime = false;
        int count = 0;
        for(int divisor = 1; divisor <= number; divisor++){

            if(number % divisor == 0){

                count++;

            }

        }
        if (count == 2){
            prime = true;
        }
        return prime;
   
    }

    public static void main(String[] args){

        isPrime(5);

    }
}

