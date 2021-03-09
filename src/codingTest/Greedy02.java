package codingTest;
import java.util.*;

public class Greedy02 {
	public static int solution(int n, int m, int[][] cards) {
		int answer = Integer.MIN_VALUE;
		//행별로 돌기
		for(int i=0;i<cards.length;i++) {
			//stream 사용하기 위해서 각 행에 해당되는 배열을 Integer로 바꾼다음 그 배열 내에 제일 작은 거 저장
			Integer[] arr =Arrays.stream(cards[i]).boxed().toArray(Integer[]::new);
			int min = List.of(arr).stream().min(Integer::compare).orElse(-1);
			//이전이랑 비교했을 때 제일 큰 값 반환
			if(answer<min) answer=min;		
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] cards1 = {
				{3,1,2},
				{4,1,4},
				{2,2,2}
		};
		int answer1 =solution(3,3,cards1);
		System.out.println("answer1="+answer1);
		int[][] cards2= {
				{7,3,1,8},
				{3,3,3,4}
		};
		int answer2 =solution(2,4,cards2);
		System.out.println("answer2="+answer2);
	}

}
