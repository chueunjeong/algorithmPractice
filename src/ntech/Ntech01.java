package ntech;
import java.util.*;

public class Ntech01 {
	public static int solution(int[][] arr) {
		//���� �Ǿ��ִ� ��¥�� ����ϴ� 365��¥�� �迭�� ���� ����,
		//�� ������ŭ �ݺ����� ���� �ش� ���� �� ��¥�� üũ�� �Ѵ���
		//���� 1���� �� ��(0�� �ƴ� ��)�� ����Ѵ�.
		int answer =0;
		int[] days = new int[365];
		
		for(int i=0;i<arr.length;i++) {
			int k=arr[i][0]-1;
			while(k<(arr[i][1]-1)) {
				days[k]++;
				k++;
				
			}
		}
		
		for(int day:days) if(day!=0) answer++;
		
		return answer;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr1= {
				{2, 5}, {3, 7}, {10, 11}
		};
		int answer1 =solution(arr1);
		System.out.println("answer1=6 "+answer1);
		int[][] arr2= {
				{3, 4},{4, 5}, {6, 7}, {8, 10}
		};
		int answer2 =solution(arr2);
		System.out.println("answer2=5 "+answer2);
	}

}
