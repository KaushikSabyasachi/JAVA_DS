
import java.util.*;
import java.util.Map.Entry;
class HASH_NONOVERLAPPING_SUM_2set{
    
    static int NON_overlapping_sum(int A[] ,int B[]){
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
        
        int SUM=0 ;
        Iterator IT = HASH.iterator(); //ITERATING THE HASH AND ADDING TO SUM 
        while(IT.hasNext()){
            SUM+= (int)IT.next(); // AS THE HASH CONTAINS IN OBJECT MANNER SO WE HAVE TO USE INT TO CONAVERT IT TO INTEGER MANNER  
        }
        return SUM; // RETURNING THE SUM .
    }
    
    public static void main(String[] args) {
        Scanner SC = new Scanner (System.in);
        int T = SC.nextInt();
        int A[] = new int [T];
        int B[] = new int [T];
        
        for (int i =0;i<T;i++){A[i]=SC.nextInt();} //TWO ARRAY INPUTS
         for (int j =0;j<T;j++){B[j]=SC.nextInt();}
         
System.out.println(NON_overlapping_sum(A,B)); //PRINTING THE SUM THAT LL BE RETURNED  BY THE FUNCTION
    }
}