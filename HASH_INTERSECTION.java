
import java.util.*;
class HASH_INTERSECTION {
    public static void main(String[] args) {

	Scanner SC = new Scanner(System.in); //FOR USER input in HASH we use a scanner CALSS
	
	HashSet<Integer> HASH= new HashSet <>(); //A HASHSET TO STORE INTERSECTION  ELEMENTS.
	
	int N = SC.nextInt(); // ARRAY SIZE (Superset)
	int [] A = new int[N]; // Creating a Array of size N.
	for (int i=0; i<N;i++) {
		A[i] = SC.nextInt(); 
	}
	//System.out.println(A);
	
	int M= SC.nextInt(); // ARRAY SIZE (Subset of Superset)
	int [] B = new int[M]; // Creating a Array of size M.
	for (int j=0;j<M;j++) {
			B[j]= SC.nextInt();
	}
	//System.out.println(B);

for (int j=0;j<M;j++){  //AS WE HAVE TAKEN 'B' AS A-SUBSET OF 'A' SO WE LL' CHECK WHETHER Jth Index of B is PRESENT IN 'A' ;
    for (int i=0 ;i<N;i++){ //TRAVERSING THROUGHOUT THE A WHETHER 'A' is Present or not !!
    if (B[j] ==A[i]){ //check of 'B[j th Index]' in 'A[i th Indec]'' .
        HASH.add(B[j]);} // IF PRESSENT THEN ADD TO HASH .
    }
}
System.out.println(HASH); //PRINT HASH 
    }
}