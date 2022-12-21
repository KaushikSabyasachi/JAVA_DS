//Most frequent element in an array
import java.util.*;
import java.util.Map.Entry;

class HASH_MOSTFREQ_ELEMENT{
    static int Most_frequency_element(int A[] , int N){ 
        
        HashMap<Integer,Integer>Hash = new HashMap<>();// HASH TO STORE THE INTEGERS AND THEIR FREQUENCY
       int freq =0;
        for (int i=0 ;i<N;i++){
            if (Hash.containsKey(A[i])){ //IF ITS A HIT ,THAT ENTERED ELEMENTS ARE BEFORE THEIR THEN WE HAVE TO INCREASE THE FREQUENCY BY 1 .
                freq = Hash.get(A[i])+1;
                Hash.put(A[i],freq); // THEN WE PUT IT INTO THE HASH AGAIN
            }
            else {
                Hash.put(A[i],1); //WHEN THERE IS NOT A MATCH WITH ENTERED ELEMENTS THEN WE WILL INSERT THE NO INTO HASH AND SET FREQUENCY INTO 1 .
            }
        }
        
         int max_count = 0, res = -1; //WE ASSIGN A INTIAL VALUE TO MAX_COUNT=0 AND RESULT .
        for(Entry<Integer, Integer> val : Hash.entrySet()) //ITERATING THE VALUE OF  THE HASH 
        {
            if (max_count < val.getValue()) // IF THE VALUE IS  MORE THAN MAX_COUNT THEN WE LL  ASSIGN ITS KEY TO REULLT AND UPDATE THE MAX_COUNT TO THE ITERATER VALUE .
            {
                res = val.getKey();
                max_count = val.getValue();
            }
        }
        return res; // WHEN THE LOOP GOT OVER IT RETURN THE VALUE WHICH WAS MOST NO OF TIMES FREQUENTLY .
    }
    
    public static void main(String[] args) { 
        Scanner SC = new Scanner(System.in); 
        int N = SC.nextInt();
        int A[] = new int[N];  //SIZE OF ARRAY
        
        for (int i=0 ;i<N;i++){
            A[i] =SC.nextInt();  // ARRAY ENTERY 
        }
        
      System.out.println(Most_frequency_element(A,N));  // PRINTING THE RETURN OF THE FUNCTION (Most_frequent_elements)
    }
}