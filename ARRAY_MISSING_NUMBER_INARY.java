//{ Driver Code Starts
import java.util.*;
class ARRAY_MISSING_NUMBER_INARY{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
 int n = sc.nextInt();
 int [] array = new int[n];
 
 for (int j=0;j<n;j++){array[j] =sc.nextInt();} //INPUT IN A ARRAY
 
 int Sum=0;
        int SUM1= (n*(n+1))/2;
        for (int i=0;i<n-1;i++){
            Sum = Sum+array[i];
        }
        System.out.println(Sum-SUM1);
 }
}