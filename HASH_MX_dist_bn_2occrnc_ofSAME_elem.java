//Maximum distance between two occurrences of same element in array
import java.util.*;
class HASH_MX_dist_bn_2occrnc_ofSAME_elem{
    static int Max_Distance(int A[] , int N){ //USING USER INPUT ARRAY AND N F
        
        int MAX_Distance =0; //INITIAL MAX_distance is 0
        HashMap<Integer,Integer>Hash = new HashMap<>(); //Hashmap to store the INTEGER AND INDEXING  OF THE INTEGER  
        
        for (int i=0 ;i<N ;i++){  // LOOP ON
            if (!Hash.containsKey(A[i])){ //ITS A CONCATINATION (NOT TRUE/ IF FALSE) STATEMENT THAT TO CHECK .
                Hash.put(A[i],i); //IF FALSE THEN WE HAVE TO ADD THE ELEMENT AND THEIR INDEX NO .
            }
            else {
                MAX_Distance = Math.max(MAX_Distance ,i- Hash.get(A[i]));
                // IF ANY ELEMENT WAS THERE THEN IT LL RUN ELSE AND WE LL UPDATE THE MAX_DISTANCE TO PREVIOUS INDEX MINUES THE NEW INDEX .
            }
        }
        return MAX_Distance; // IT LL  RETUEN THE MAX_DISTANCE
    }
    
    public static void main(String[] args) { 
        Scanner SC = new Scanner(System.in); //Scanner CLASS FOR TAKING USER inPUT 
        int N = SC.nextInt();
        int A[] = new int[N]; //ARRAY INITIALIZATION
        
        for (int i=0 ;i<N;i++){
            A[i] =SC.nextInt(); //ENTERING ELEMENTS INTO ARRAY
        }
        
      System.out.println(Max_Distance(A,N)); // PRINTING THE RETURN OF THE MAX_DISTANCE BETWEEN SAME ELEMENTS .#taking a MAX_DISTANCE FUNCTION
    }
}