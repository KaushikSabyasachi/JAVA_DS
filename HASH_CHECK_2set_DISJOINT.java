//Given two sets represented by two arrays, how to check if the given two sets are disjoint or not? It may be assumed that the given arrays have no duplicates.


import java.util.*;
class CHECK_2set_DISJOINT {
    
    static boolean areDisjoint(int A[] ,int B[]){
            HashSet<Integer>HASH =new HashSet<>();
            
            for (int i=0;i<A.length;i++){ //FIRST WE ENTERED ALL  ELEMENTS IN A ARRAY TO HASH .
                    HASH.add(A[i]);
            }
            
            for (int i=0;i<B.length;i++){ // CHECK WHETHER ARRAY B'S  ANY ELEMENT PRESENT IN THE HASH OR NOT . IF THERE IT WILL  RETURN FALSE SO THAT MAIN CLASS IF WILL BE FALSE AND "NO(THE TWO ARRAY ARE NOT DISJOINT)" LL BE PRINTED .
                    if (HASH.contains(B[i])){
                        return false;
                    }
            }
            return true;
    }
    
    public static void main(String[] args) {
        Scanner SC = new Scanner (System.in);
        int T = SC.nextInt();
        int A[] = new int [T];
        int B[] = new int [T];
        
        for (int i =0;i<T;i++){A[i]=SC.nextInt();} //TWO ARRAY INPUTS
         for (int j =0;j<T;j++){B[j]=SC.nextInt();}
         
         if (areDisjoint(A,B)){ // IF CONDITION TRUE THEN RETURN YES OR ELSE NO,SO WE USE BOOLEAN RETURN .
             System.out.println("Yes");}
         else 
         System.out.println("NO");
    }
}