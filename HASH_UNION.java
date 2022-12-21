import java.util.*;

class HASH_UNION {
	public static void main(String[] args) {
		Scanner SC = new Scanner(System.in); // FOR USER input in HASH we use a scanner CALSS

		HashSet<Integer> HASH = new HashSet<>(); // A HASHSET TO STORE INTERSECTION ELEMENTS.

		int N = SC.nextInt(); // ARRAY SIZE (Superset)
		int[] A = new int[N]; // Creating a Array of size N.
		for (int i = 0; i < N; i++) {
			A[i] = SC.nextInt();
			Integer a = A[i];
			HASH.add(a); // ADDING TO A HASHSET
		}

		int M = SC.nextInt(); // ARRAY SIZE (Subset of Superset)
		int[] B = new int[M]; // Creating a Array of size M.
		for (int j = 0; j < M; j++) {
			B[j] = SC.nextInt();
			Integer b = B[j];
			HASH.add(b); // ADDING TO HASHSET
		}

		System.out.println(HASH); // PRINT HASHSET WITHOUT REPEATING ANY ELEMENTS AS A SET METHOD
	}
}

