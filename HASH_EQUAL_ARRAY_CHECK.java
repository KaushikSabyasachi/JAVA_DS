//Given two arrays, arr1 and arr2 of equal length N, the task is to find if the given arrays are equal or not. 
import java.util.*;
class HASH_EQUAL_ARRAY_CHECK {
     static boolean EQUAL_ARRAY_CHECK(int A[] ,int B[]){
        HashSet<Integer>HASH = new HashSet<>(); 
        
        for (int i=0;i<A.length;i++){ // ADDING ELEMENTS TO HASH . 
            HASH.add(A[i]);
        }
        
        for(int j =0;j<B.length;j++){ //IF HASH CONTAINS A ELEMENTS THAT IS PRESENT IN B THEN REOMVE THE ELEMENTS FROM THE HASH OR ELSE KEEP IT
            if(HASH.contains(B[j])){
                HASH.remove(B[j]);
            }
            else {
                HASH.add(B[j]);
            }
        }
        if (HASH.size()>0){return false;} //IF THE SIZE OF HASH IS MORE THEN IT LL RETURN FALSE OR ELSE IT LL  PRINT TRUE .
        else {return true; }
    }
    
    public static void main(String[] args) {
        Scanner SC = new Scanner (System.in);
        int T = SC.nextInt();
        int A[] = new int [T];
        int B[] = new int [T];
        
        for (int i =0;i<T;i++){A[i]=SC.nextInt();} //TWO ARRAY INPUTS
         for (int j =0;j<T;j++){B[j]=SC.nextInt();}
         
System.out.println(EQUAL_ARRAY_CHECK(A,B)); //PRINTING BOOLEAN  RETURNED  BY THE FUNCTION
    }
}