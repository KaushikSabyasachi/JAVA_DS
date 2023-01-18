import java.util.*;
public class ARRAY_MAXSUM_OF_SUBARRAY {
public static void main(String args[]) {
	
	Scanner SC = new Scanner(System.in);
	
	int T = SC.nextInt(); // LENGTH OF THE ARRAY 
	int [] NUMS = new int[T]; // ARRAY SIZE OF LENGTH 
	
	for (int i=0;i<T;i++) {NUMS[i]= SC.nextInt();} // INPUTS OF ARRAY 
	
	  int curr_sum =0;  //CURRENT SUM OF SUBARRAY
      int max_sum =Integer.MIN_VALUE;  // MINIMUM  VALUE THAT A NUMBER CAN HOLD

      for (int i=0;i<T;i++){
          curr_sum += NUMS[i]; // CURRENT SUM LL BE THE SUM OF ITTERATION OF ARRAYS  
          max_sum = Math.max(max_sum,curr_sum); // MAX AMONG THE MAX_SUM AND CURRENT _SUM 
          
        if (curr_sum<0){curr_sum =0;} // IF THE CURRENT SUM IS LESS THAN 0 THEN IT LL ASSIFN ITS VALUE AS 0
        
        //curr_sum  = Math.max(curr_sum,0);
      }
      System.out.println(max_sum);
}
}


