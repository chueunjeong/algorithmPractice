package programmers;
import java.util.*;


public class Sort2 {

	public static String solution(int[] numbers) {

		StringBuilder answer = new StringBuilder();
		//받은 수들을 문자열 배열로 변경
		String[] arr = new String[numbers.length];
		int n=0;
		for(int i=0;i<arr.length;i++) {
			if(numbers[i]==0) n++;
			arr[i]=new String(new char[5]).replace("\0", String.valueOf(numbers[i]));
		}
		if(n==numbers.length) return "0";
		//문자열의 길이로 비교하고 같다면 내림차순으로 정렬
		Arrays.sort(arr,Collections.reverseOrder());
		for(String s:arr) {
			answer.append(s.substring(0, s.length()/5));
		}

		return answer.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {6, 10, 2};		
		String answer1 = solution(numbers);
		System.out.println("answer1="+answer1);
		int[] numbers2 = {3, 30, 34, 5, 9};		
		String answer2 = solution(numbers2);
		System.out.println("answer2="+answer2);
		int[] numbers3 = {0,0,0};		
		String answer3 = solution(numbers3);
		System.out.println("answer2="+answer3);


	}

}
