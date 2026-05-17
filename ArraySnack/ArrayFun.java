public class ArrayFun {



 public static void main(String[] args){
  
  int array[]= {10,3,4};
  
  System.out.println(largestElement(array));
   }
   
   

public static int largestElement(int array[]) {
int largest=0;
for (int index=0; index <array.length; index++){

        if(array[index]>largest){
        
        largest= array[index];
        
         
        }
        

}
  return largest;

 }
   
   
   
   
  }
  
  
