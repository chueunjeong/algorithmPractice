package programmers;
import java.util.*;


public class FullSearch1 {

	public static int[] solution(int[] answers) {
        int[] answer = {};
        int len=answers.length;
        int[] n1={1,2,3,4,5};
        int[] n2={2, 1, 2, 3, 2, 4, 2, 5};
        int[] n3={3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int s1=len/n1.length,r1=len%n1.length;
        int s2=len/n2.length,r2=len%n2.length;
        int s3=len/n3.length,r3=len%n3.length;
        int c1=0,c2=0,c3=0;
        if(len<=5) {
        	for(int i=0;i<len;i++) {
        		if(n1[i]==answers[i]) c1++;
        		if(n2[i]==answers[i]) c2++;
        		if(n3[i]==answers[i]) c3++;
        	}
        }
        
        System.out.println("c1-"+c1+" c2-"+c2+" c3-"+c3);
        
        return answer;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {1,2,3,4,5};		
		int[] answer1 = solution(numbers);
		System.out.println("answer1=3"+answer1);
		
		int[] numbers2 = {1,3,2,4,2};		
		int[] answer2 = solution(numbers2);
		System.out.println("answer2=3"+answer2);

		

	}

}
