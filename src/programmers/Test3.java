package programmers;
import java.util.*;


public class Test3 {

	public static int solution(int[] openA, int[] closeB) {
        int answer = 0;
        int start = openA[0];
        int len = closeB[closeB.length-1];
        int[] frige = new int[len];
        Arrays.fill(frige,start,len,9);
        for(int i=0;i<openA.length;i++) {
        	frige[openA[i]]=1;        	
        }
        for(int i=0;i<closeB.length-1;i++) {
        	frige[closeB[i]]=2;        	
        }
        for(int i =0;i<frige.length;i++) {
        	if(frige[i]==2 && (i+1)!=frige.length &&frige[i+1]==9) {
        		System.out.println("now:"+frige[i]);
        		frige[i+1]=2; 
        	}
        }
        for(int k:frige)
        	if(k==1 ||k==9) answer++;
        System.out.println(Arrays.toString(frige));
        return answer;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] openA = {3, 5,7};
		int[] closeB = {4,10,12};
		int answer1 = solution(openA,closeB);
		System.out.println("answer1=6=-----"+answer1);
		int[] openA2 = {4, 7,9,16};
		int[] closeB2 = {2,5,12,14,20};
		int answer2 = solution(openA2,closeB2);
		System.out.println("answer2=10=-----"+answer2);
		
		
		

	}

}
