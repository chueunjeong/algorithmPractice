package ntech;
import java.util.*;

public class Ntech04 {
	public static int solution(int[][] t1,int[][] t2) {		
		int answer=0;		
		for(int i=0;i<t1.length;i++) {				
			boolean tf=check(t1,t2,i,0);
			if(tf) answer++;
			

		}
		return answer;
	}

	private static boolean check(int[][] t1, int[][] t2, int root,int t2root) {
		
		//둘 다 자식이 없을경우
		if(t2[t2root][0]==-1 &&t2[t2root][1]==-1) {			
			if(t1[root][0]==-1 &&t1[root][1]==-1) return true;
			else return false;
		}
		//오른쪽 자식만 있는 경우
		else if(t2[t2root][0]==-1 &&t2[t2root][1]>0) {			
			if(t1[root][0]==-1 &&t1[root][1]>0) return true && check(t1,t2,t1[root][1],t2[t2root][1]);
			else return false;
		}
		//왼쪽 자식만 있는 경우
		else if(t2[t2root][0]>0 &&t2[t2root][1]==-1) {			
			if(t1[root][0]>0 &&t1[root][1]==-1) return true && check(t1,t2,t1[root][0],t2[t2root][0]);
			else return false;
		}
		//둘 다 자식이 있는 경우
		else if(t2[t2root][0]>0 &&t2[t2root][1]>0) {			
			if(t1[root][0]>0 &&t1[root][1]>0) return check(t1,t2,t1[root][0],t2[t2root][0]) && check(t1,t2,t1[root][1],t2[t2root][1]);
			else return false;
		}
		else return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a1= {
				{1,2},{3,4},{5,6},
				{-1,7},{8,9},{-1,-1},
				{-1,-1},{-1,-1},{-1,-1},{-1,-1}
		};
		int[][] a2= {
				{1,2},{-1,-1},{-1,-1}	
		};
		int answer1 =solution(a1,a2);
		System.out.println("answer1=2 "+answer1);

		int[][] b1= {
				{1,2},{3,4},{5,6},
				{-1,7},{8,9},{-1,-1},
				{-1,-1},{-1,-1},{-1,-1}
				,{-1,-1}
		};
		int[][] b2= {
				{-1,1},{-1,-1}
		};
		int answer2 =solution(b1,b2);
		System.out.println("answer2=1 "+answer2);

		int[][] c1= {
				{1,2},{3,4},{5,6},
				{-1,7},{8,9},{-1,-1},
				{-1,-1},{-1,-1},{-1,-1},{-1,-1}
		};
		int[][] c2= {
				{-1,-1}	
		};
		int answer3 =solution(c1,c2);
		System.out.println("answer3=5 "+answer3);
		
		int[][] d1= {
				{1,2},{3,4},{5,6},
				{-1,7},{8,9},{-1,-1},
				{-1,-1},{-1,-1},{-1,-1},{-1,-1}
		};
		int[][] d2= {
				{1,2},{-1,3},{4,5},
				{-1,-1},{-1,-1},{-1,-1}
		};
		int answer4 =solution(d1,d2);
		System.out.println("answer4=1 "+answer4);


	}

}
