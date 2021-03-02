package CodingTest;
import java.util.*;

public class Greedy01 {
	public static int solution(int n, int m, int k, int[] numbers) {
		//int �迭�� �������� ����
		//������ �ʿ���� �۾��̾���;;;
		Integer[] arr =Arrays.stream(numbers).boxed().toArray(Integer[]::new);
		Arrays.sort(arr,Collections.reverseOrder());
		//������ ���� ������ ���ӵǴ� ���� Ȯ���� �� ����
		int answer=0;
		int k_count=0;
		//m��ŭ ���ϱ�
		for(int i=0;i<m;m--) {
			//������ k��ŭ ���ӵǸ� �ι�° �� ���ϱ�
			if(k_count==k) {
				answer +=arr[1];
				k_count =0;
			}
			//�ƴ� ��� ��� ù��° �� ���ϱ�
			else {
				answer += arr[0];
				k_count++;
			}
			
		}
		
		return answer;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1= {2,4,5,4,6};
		int answer1 =solution(5,8,3,arr1);
		System.out.println("answer1="+answer1);
		int[] arr2= {3,4,3,4,3};
		int answer2 =solution(5,7,2,arr2);
		System.out.println("answer2="+answer2);
	}

}
