import java.util.*;

public class  ARRAY_DISTINCT_LRG_3ELMT {
public static void main(String args[]) {
	Scanner SC = new Scanner(System.in);
	int T =SC.nextInt();
	
	int[] A = new int[T];
	
	for (int i=0;i<T;i++) {A[i] =SC.nextInt();}
	
	Arrays.sort(A);
	

	HashSet <Integer> SET =new HashSet<>();
	
	for (int j=T-1;j>=0;j--) {
		int M = A[j];
		Integer N = M;
		SET.add(N);
	
	}
	
	Iterator IT = SET.iterator();
	
	int K =2;
	while (IT.hasNext() && K>=0 ) {
		System.out.println(IT.next());
		K--;
	}
}
}
