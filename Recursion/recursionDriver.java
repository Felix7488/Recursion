
public class recursionDriver
{
 
     public static int count(int n)
    {
        // Base case AKA Stop Condition
         if (n==0)
             return 0; 
 
         if (n==1)
             return 4;
 
         return 4+count(n-1); 
    } 
 
 
 
     public static void main(String[] args)
     {
     /*
     * Count the number of legs 10 elephants have
     */ 
    //Task 1
    int counted=0;
     counted = count(10);
     System.out.println(counted);
   

    }
}