package CodingTest;
import java.util.*;

public class Greedy03 {
	public static int solution(int n, int k) {
		int answer =0;
		//n이 1이 될때까지
		while(n!=1) {
			//나눠야 더 빨리 작아지기 때문에 먼저 나눠보고 안 나눠지면 1을 뺀다
			//둘 중 한 과정이 끝나면 횟수+1을 해서 총 몇 회 돌았는지 저장
			if(n%k==0) n /=k;
			else n--;			
			answer++;
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int answer1 =solution(17,4);
		System.out.println("answer1=3-> "+answer1);
		
		int answer2 =solution(25,5);
		System.out.println("answer2=2-> "+answer2);
		
		int answer3 =solution(10,2);
		System.out.println("answer3=4-> "+answer3);
	}

}
