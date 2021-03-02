package programmers;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class M_Test3 {
	enum Arrow {UP,DOWN};	
	public static long solution(int n, int r, int c) {
		long answer = 0;
		int[][] map = new int[n][n];
		//map[0][0] = 1;
		int now=1,last = n*n;
		
		int x=0,y =0;
		Arrow arrow = Arrow.UP;
		
		while(now<=last) {
			
			if(x==0 &&y==0) {				
				map[x][y++]=now++;
				arrow = Arrow.DOWN;
			}
			if(y==n-1) {
				if(arrow==Arrow.UP) {
					
					map[x++][y]=now++;
					arrow=Arrow.DOWN;
				}
				if(arrow==Arrow.DOWN) {
					
					map[x++][y--]=now++;
				}
			}
			if(x==n-1) {
				if(arrow==Arrow.DOWN) {
					
					map[x][y++]=now++;
					arrow=Arrow.UP;
				}
				if(arrow==Arrow.UP) {
					
					map[x--][y++]=now++;
				}
			}
			if(x==0) {
				if(arrow==Arrow.UP) {
					
					map[x][y++]=now++;
					arrow=Arrow.DOWN;
				}
				if(arrow==Arrow.DOWN) {
					
					map[x++][y--]=now++;
				}
			}
			if(y==0) {
				if(arrow==Arrow.DOWN) {
					
					map[x++][y]=now++;
					arrow=Arrow.UP;
				}
				if(arrow==Arrow.UP) {
					
					map[x--][y++]=now++;
				}
			}
			if(arrow==Arrow.UP && x<=n-1 && y<=n-1) {
				
				map[x--][y++]=now++;
				
			}
			if(arrow==Arrow.DOWN && x<=n-1 && y<=n-1) {
				
				map[x++][y--]=now++;
				
			}
	

		}
		  for(int i = 0 ; i < n; ++i)
		  {
		   for(int j = 0 ; j < n; ++j)
		   {
		    System.out.print(map[i][j]+ " ");
		   }System.out.println();
		  }
		  answer=map[r-1][c-1];
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=5,r1=3,c1=2;
		System.out.println("answer="+solution(n1,r1,c1));
		int n2=6,r2=5,c2=4;
		System.out.println("answer="+solution(n2,r2,c2));


	}

}
