package codingTest;
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
	public static int solution2(int n, int k) {
		//조금 복잡하지만 한번에 빼서 계산하는 방법
		//n=25 k=3을 예시로 두자면
		//25= 8*3+1 <-여기서 k로 일단 나눠졌으므로 [+1]나머지는 어차피 뺄 과정이었으므로 [+1]
		//8= 2*3+2 <-여기서도 k로 일단 나눠졌기 때문에 [+1] 역시 나머지도 어차피 -1로 하나씩 뺄거 한꺼번에 뺀 거 [+2]
		//2 이제 k보다 작아졌는데 이걸 1로 만들어줘야 한다 2-1=1로 [+1] 만약 2가 아니라 3이었으면 이것 역시 1로 만들어야 하기 때문에
		//3-1=2이로 +2를 해주었을것이다
		//[]한 숫자들을 모두 더하면 1+1+1+2+1=6으로 하나씩 한 과정과 답이 같다.
		int count = 0;
		while(true) {
			int share = (n/k)*k;
			int rest = n-share;
			count +=rest;
			n=share;
			if(n<k) break;
			n/=k;
			count++;
		}
		count +=(n-1);
		return count;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int answer1 =solution2(17,4);
		System.out.println("answer1=3-> "+answer1);
		
		int answer2 =solution2(25,5);
		System.out.println("answer2=2-> "+answer2);
		
		int answer3 =solution(10,2);
		System.out.println("answer3=4-> "+answer3);
	}

}
