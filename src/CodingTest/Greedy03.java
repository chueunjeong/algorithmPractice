package CodingTest;
import java.util.*;

public class Greedy03 {
	public static int solution(int n, int k) {
		int answer =0;
		//n�� 1�� �ɶ�����
		while(n!=1) {
			//������ �� ���� �۾����� ������ ���� �������� �� �������� 1�� ����
			//�� �� �� ������ ������ Ƚ��+1�� �ؼ� �� �� ȸ ���Ҵ��� ����
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
