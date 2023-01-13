import java.util.*;
public class ARRAY_VALUEeual_INDEX {
		public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
	 int n = sc.nextInt();
	 int [] arr = new int[n];
	 
	 for (int j=0;j<n;j++){arr[j] =sc.nextInt();} //INPUT IN A ARRAY
	 
	 
	 ArrayList<Integer> result = new ArrayList<>();
     for (int i=0;i<n;i++){
         if (arr[i] == i+1){
             result.add(i+1);
         }
     }
     System.out.println(result);
		}
}
