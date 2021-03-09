package codingTest;
import java.util.*;

public class Greedy01 {
	public static int solution(int n, int m, int k, int[] numbers) {
		//int 배열을 역순으로 정렬
		//하지만 필요없는 작업이었음;;;
		Integer[] arr =Arrays.stream(numbers).boxed().toArray(Integer[]::new);
		Arrays.sort(arr,Collections.reverseOrder());
		//정답을 담을 변수와 연속되는 것을 확인해 줄 변수
		int answer=0;
		int k_count=0;
		//m만큼 더하기
		for(int i=0;i<m;m--) {
			//연속이 k만큼 지속되면 두번째 수 더하기
			if(k_count==k) {
				answer +=arr[1];
				k_count =0;
			}
			//아닌 모든 경우 첫번째 수 더하기
			else {
				answer += arr[0];
				k_count++;
			}			
		}		
		return answer;
	}
	public static int solution2(int n, int m, int k, int[] numbers) {
		//더하는 게 일정한 규칙이 있으므로 
		//6+6+6+5 + 6+6+6+5
		//규칙 크기만큼이면 그 몫만큼 곱하고 나머지가 있다면 나머지는 제일 큰 수를 곱해 더한다.
		Arrays.sort(numbers);
		int answer = (m/(k+1))*(numbers[n-1]*k+numbers[n-2])+(m%(k+1))*numbers[n-1];
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1= {2,4,5,4,6};
		int answer1 =solution2(5,8,3,arr1);
		System.out.println("answer1="+answer1);
		int[] arr2= {3,4,3,4,3};
		int answer2 =solution(5,7,2,arr2);
		System.out.println("answer2="+answer2);
	}

}
