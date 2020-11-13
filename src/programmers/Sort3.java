package programmers;
import java.util.*;


public class Sort3 {

	public static int solution(int[] citations) {
		int answer = 0;
		 int q=0,n=0;
	        Arrays.sort(citations);
	       
	        for(int h=0;h<=citations.length;h++){	        	
	            q=0;n=0;
	            for(int i:citations){
	                if(i>=h) q++;
	                if(i<=h) n++;                
	            }
	            if(q<h) break;
	            answer=h;	            
	        }
	        return answer;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {3, 0, 6, 1, 5};		
		int answer1 = solution(numbers);
		System.out.println("answer1=3"+answer1);
		
		int[] numbers2 = {25, 8, 5, 3, 3};		
		int answer2 = solution(numbers2);
		System.out.println("answer2=3"+answer2);
		int[] numbers3 = {4,4,4};		
		int answer3 = solution(numbers3);
		System.out.println("answer3=4"+answer3);
		

	}

}
