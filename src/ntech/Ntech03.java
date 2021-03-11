package ntech;
import java.util.*;

public class Ntech03 {
	public static int solution(int[] arr) {
		//넓이를 저장할 변수와 너비와 높이를 저장할 변수를 적절히 초기화한다
		//양 기둥이 될 배열의 양끝을 시작과 끝이라는 변수로 저장한 다음
		//두 기둥이 만나기 전까지 반복문을 돌린다
		//둘 중 더 낮은 기둥이 높이가 되고 둘 사이의 숫자 갯수가 너비가 되어서
		//반복문 중 가장 큰 넓이 값이 답이 된다.
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
