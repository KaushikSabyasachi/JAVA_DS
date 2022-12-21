//Given an array of n integers. The task is to find the first element that occurs k number of times. If no element occurs k times the print -1. The distribution of integer elements could be in any range.

import java.util.*;
import java.util.Map.Entry;
class HASH_1stElem_toREP_Ktms {
    static  int firstElemnt(int A[] ,int N ,int K){
        HashMap<Integer,Integer> Hash = new HashMap<>();
        
        int freq =0;
        for (int i=0 ;i<N ;i++){
            if (Hash.containsKey(A[i])){
                freq =Hash.get(A[i])+1;
                Hash.put(A[i],freq);
            }
            else{
                Hash.put(A[i],1);
            }
        }
        int result =-1;
        for(Entry<Integer, Integer> val : Hash.entrySet()) //itterating the value of the hash table and if the value is equal to the required value  we ll call 'getKey' and assign to a value .
        {
            if (val.getValue() ==K)
            {
                result = val.getKey();
            
            }
        }
        return result;
    }
    
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        int N = SC.nextInt();
        int A [] = new int[N];
        for (int i=0;i<N;i++){
            A[i] =SC.nextInt();
        }
        int K = SC.nextInt();
        System.out.println(firstElemnt(A,N,K));
    }
}