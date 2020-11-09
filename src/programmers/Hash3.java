package programmers;

import java.util.HashMap;
import java.util.Map;

public class Hash3 {

	
	    public static int solution(String[][] clothes) {
	        int answer = 0;
	        Map<String,Integer> map = new HashMap<String,Integer>();
	         for(int i=0;i<clothes.length;i++){
	            map.put(clothes[i][1],map.getOrDefault(clothes[i][1],1)+1);
	        }
	        answer += 1;
	        for (String key : map.keySet())
	             answer *= map.get(key);

	        return answer-1;

	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] clothes = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
		int answer1 = solution(clothes);
		System.out.println("answer1="+answer1);
	}

}
