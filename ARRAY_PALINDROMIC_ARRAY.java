
import java.util.*;
class ARRAY_PALINDROMIC_ARRAY{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
 int n = sc.nextInt();
 int [] a = new int[n];
 for (int j=0;j<n;j++){a[j] =sc.nextInt();} //INPUT IN A ARRAY
 
                  int Y=0;
                  
                for (int i=0 ;i<n ;i++){
                  int A= a[i]; // STORING EACH ELEMENT FIRST
                  int temp =A; //  TEMP IS THAT ELMENT
                  int B =0; // ASSIGNING A VALUE SO THAT WE CAN STORE REVERSE
                  
                   while (A!=0){
                       B = (B*10)+(A%10); // REVERSEING
                       A=A/10;
                   }
                   if (B ==temp){ // REVERSING EQUAL TO FIRST ELEMENT
                       Y+=1;
                   }
                   else { break;}
                }
                if (Y==n){
                System.out.println(1);}
                else
                System.out.println(0);
           }
}