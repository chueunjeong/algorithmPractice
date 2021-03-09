package codingTest;
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
	public static int solution2(int n, int k) {
		//���� ���������� �ѹ��� ���� ����ϴ� ���
		//n=25 k=3�� ���÷� ���ڸ�
		//25= 8*3+1 <-���⼭ k�� �ϴ� ���������Ƿ� [+1]�������� ������ �� �����̾����Ƿ� [+1]
		//8= 2*3+2 <-���⼭�� k�� �ϴ� �������� ������ [+1] ���� �������� ������ -1�� �ϳ��� ���� �Ѳ����� �� �� [+2]
		//2 ���� k���� �۾����µ� �̰� 1�� �������� �Ѵ� 2-1=1�� [+1] ���� 2�� �ƴ϶� 3�̾����� �̰� ���� 1�� ������ �ϱ� ������
		//3-1=2�̷� +2�� ���־������̴�
		//[]�� ���ڵ��� ��� ���ϸ� 1+1+1+2+1=6���� �ϳ��� �� ������ ���� ����.
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
