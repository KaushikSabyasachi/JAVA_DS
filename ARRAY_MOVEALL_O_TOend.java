import java.util.*;
public class ARRAY_MOVEALL_O_TOend {
public static void main(String args[]) {
	Scanner SC =new Scanner(System.in);
	
	int T = SC.nextInt();
	
	int A[] =new int[T];
	int B[] =new int[T];
	
	for(int i=0;i<T;i++) {A[i]= SC.nextInt();}
	
	
	int count=0;
	 // Traverse the array. If element encountered is
    // non-zero, then replace the element at index 'count'
    // with this element
	 for (int j = 0; j < T; j++) {
         if (A[j] != 0)
             A[count++] = A[j]; }
	 
	// Now all non-zero elements have been shifted to
     // front and 'count' is set as index of first 0.
     // Make all elements 0 from count to end.
       while (count < T)
        A[count++] = 0;
       
       for(int k=0;k<T;k++) {
    	   System.out.println(A[k]+" ");
       }
}
}
