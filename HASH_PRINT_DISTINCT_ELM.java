import java.util.*;
class HASH_PRINT_DISTINCT_ELM {
    
    static void Distinct_Element(int A[] ,int T){
        HashSet<Integer> HASH = new HashSet<>();
        for (int j=0;j<T;j++){
            if (!HASH.contains(A[j])){
            HASH.add(A[j]); }
        }
        System.out.println(HASH);
    }
    public static void main(String[] args) {
Scanner SC =new Scanner(System.in);
int T = SC.nextInt();
int A [] =new int[T];
for (int i=0;i<T;i++){
    A[i]= SC.nextInt();
}
Distinct_Element(A,T);
    }
}