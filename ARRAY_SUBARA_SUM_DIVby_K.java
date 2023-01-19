import java.util.*;

public class ARRAY_SUBARA_SUM_DIVby_K {
public static void main(String args[]) {
		
		Scanner SC = new Scanner(System.in);
		
		int T = SC.nextInt(); // LENGTH OF THE ARRAY 
		int [] nums = new int[T]; // ARRAY SIZE OF LENGTH 
		
		for (int i=0;i<T;i++) { nums[i]= SC.nextInt();} // INPUTS OF ARRAY
		
		int K = SC.nextInt(); //Number that ll be used for comparisions
		
		int result = 0 ;
		for (int j=0;j<T;j++) {
			int sum = 0;
			for (int k=j;k<T;k++) {
				sum += nums[k];
			
			if (sum %K ==0) { result++;}
			
			}
		}
		System.out.println(result);
}
}
