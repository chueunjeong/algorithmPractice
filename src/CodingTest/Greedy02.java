package CodingTest;
import java.util.*;

public class Greedy02 {
	public static int solution(int n, int m, int[][] cards) {
		int answer = Integer.MIN_VALUE;
		//�ະ�� ����
		for(int i=0;i<cards.length;i++) {
			//stream ����ϱ� ���ؼ� �� �࿡ �ش�Ǵ� �迭�� Integer�� �ٲ۴��� �� �迭 ���� ���� ���� �� ����
			Integer[] arr =Arrays.stream(cards[i]).boxed().toArray(Integer[]::new);
			int min = List.of(arr).stream().min(Integer::compare).orElse(-1);
			//�����̶� ������ �� ���� ū �� ��ȯ
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
