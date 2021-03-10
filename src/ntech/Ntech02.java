package ntech;
import java.util.*;

public class Ntech02 {
	public static int solution(int n) {
		int[] ways = new int[45];
		
		ways[0]=1;
		ways[1]=2;
		
		for(int i=2;i<n;i++) {
			ways[i]=ways[i-1]+ways[i-2];
		}
		System.out.println(Arrays.toString(ways));
		
		return ways[n-1];
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int answer1 =solution(3);
		System.out.println("answer1=3 "+answer1);
		
		int answer2 =solution(4);
		System.out.println("answer2=5 "+answer2);
		
		int answer3 =solution(5);
		System.out.println("answer2=8 "+answer3);
	}

}
