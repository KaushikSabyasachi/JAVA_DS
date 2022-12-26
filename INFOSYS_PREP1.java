
/*Input	Output	Output Description
2
123
78
130
10
0	2	
Initial experience level is 123 points.
Defeat the first monster having power of 78 and bonus of 10. Experience level is now 123+10=133.
Defeat the second monster.
3
100
101
100
304
100
1
524	2	
Initial experience level is 100 points.
Defeat the second monster having power of 100 and bonus of 1. Experience level is now 100+1=101.
Defeat the first monster having power of 101 and bonus of 100. Experience level is now 101+100=201.
The third monster can’t be defeated.*/


import java.util.*;
public class INFOSYS_PREP1 {
public static void main(String args[]) {
	Scanner SC =new Scanner(System.in);
	int T = SC.nextInt();
	int A = SC.nextInt();
	
	int X [] = new int[T];
	int Y [] = new int [T];
	
	for(int i=0 ;i<T;i++) {
		X[i] =SC.nextInt();
	}
	for (int j=0;j<T;j++) {
		Y[j] = SC.nextInt();
	}
	int cnt=0;
	Arrays.sort(X);
	
	for (int k=0;k<T;k++) {
		if (X[k]<=A) {
			A= A+Y[k];
			cnt++;
		}
	}
System.out.println(cnt);
}
}
