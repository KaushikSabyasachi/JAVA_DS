import java.util.*;

public class ARRAY_FIRSToccurance_SEARCHEDelement {
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
         int n = sc.nextInt(); //NO of elements in  A ARRAY
         int [] arr = new int[n];
 
         for (int j=0;j<n;j++){arr[j] =sc.nextInt();}
         
         int k = sc.nextInt(); // SEARCH ITEM IN THE ARRAY
 
         int T =-1; // IF ELEMENTS NOT FOUND IT LL PRINT -1 
         
         for (int i=0;i<n;i++){
          if (arr[i]==k){
         T= i;     // ELEMENTS FOUND PRINT THE FIRST TIME OCCURANCE 
         break;
     }
 }
 System.out.println(T); 
}
}