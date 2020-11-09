package programmers;

import java.util.HashMap;
import java.util.Map;

public class Hash1 {
	
	 public static String solution(String[] participant, String[] completion) {
	        String answer = "";
	        Map<String, Integer> map = new HashMap<String, Integer>();
	        //완주자 목록 넣기
	        for(String s:completion){
	        	if(map.get(s) == null) map.put(s,1);
	        	else {
	        		map.put(s,map.get(s)+1);
	        	}
	            
	        }
	        //참가자 확인하기
	        for(String s2:participant){
	            if(map.get(s2)==null || map.get(s2)==0) answer=s2;
	            else{
	                map.put(s2,map.get(s2)-1);
	            }
	        }
	        return answer;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//케이스1
		String[] participant1= {"leo", "kiki", "eden"};
		String[] completion1= {"eden", "kiki"};
		String answer1 =solution(participant1,completion1);
		System.out.println("answer1="+answer1);
		
		//케이스2
		String[] participant2= {"mislav", "stanko", "mislav", "ana"};
		String[] completion2= {"stanko", "ana", "mislav"};
		String answer2 =solution(participant2,completion2);
		System.out.println("answer1="+answer2);
	}

}

