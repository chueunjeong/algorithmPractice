package ntech;
import java.util.*;

public class Ntech03 {
	public static int solution(int[] arr) {
		//���̸� ������ ������ �ʺ�� ���̸� ������ ������ ������ �ʱ�ȭ�Ѵ�
		//�� ����� �� �迭�� �糡�� ���۰� ���̶�� ������ ������ ����
		//�� ����� ������ ������ �ݺ����� ������
		//�� �� �� ���� ����� ���̰� �ǰ� �� ������ ���� ������ �ʺ� �Ǿ
		//�ݺ��� �� ���� ū ���� ���� ���� �ȴ�.
		int area=0;
		int w= arr.length-2;
		int h=0;
		
		int start=0;
		int end=arr.length-1;
		
		while(start !=end) {
			h = (arr[start]>arr[end])?arr[end]:arr[start];			
			area=(area>(w*h))?area:(w*h);			
			
			if(arr[start]>arr[end]) end--;
			else start++;
			w--;
			
		}
		return area;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1= {2, 2, 2, 3};
		int answer1 =solution(arr1);
		System.out.println("answer1=4 "+answer1);
		
		int[] arr2 = {6, 5, 7, 3, 4, 2};
		int answer2 =solution(arr2);
		System.out.println("answer2=12 "+answer2);	
		
		int[] arr3 = {4,8,2,1,7,3};
		int answer3 =solution(arr3);
		System.out.println("answer3=14 "+answer3);	
		
	}

}
