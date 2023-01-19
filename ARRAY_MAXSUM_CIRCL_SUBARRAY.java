import java.util.Scanner;

public class ARRAY_MAXSUM_CIRCL_SUBARRAY {
	public static void main(String args[]) {
		
		Scanner SC = new Scanner(System.in);
		
		int T = SC.nextInt(); // LENGTH OF THE ARRAY 
		int [] nums = new int[T]; // ARRAY SIZE OF LENGTH 
		
		for (int i=0;i<T;i++) { nums[i]= SC.nextInt();} // INPUTS OF ARRAY 
		
		int max =Integer.MIN_VALUE , min = Integer.MAX_VALUE ; // Intially the max value ll  have the capacity to hold a list min integer 
		// anf  min value has to the largest max value 
		
        int curr1 =0 , curr2 =0 ,total =0;
        
        for (int i=0;i<nums.length;i++){

            total += nums[i]; // total  value needed to find the  CIRCULAR AGE SUM  # TOTAL-MIN 

            curr1 += nums[i] ;
            max = Math.max(max,curr1);
            curr1 =Math.max(curr1,0);  // THIS LL TO FIND THE MAX SUM #KADGENS ALGO .

            curr2 += nums[i] ;
            min = Math.min(min,curr2);  
            curr2 = Math.min(curr2,0); // THIS LL TO STORE THE MIN SUM  IN BETWEEN .

        }
        
        if (max <0 ) {	System.out.println( max);} // IF MAX <0  THEN  IT LL  PRINT MAX . ELSE  MAXIMUM AMONG (MAX ,TOTAL-MIN)
        else {System.out.println(Math.max(max, total-min));}
	    }
}