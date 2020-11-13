package programmers;
import java.util.*;

public class Sort2_failure {
	
	 public static String[] solution(int[] numbers) {
		 
		        StringBuilder answer = new StringBuilder();
		        //받은 수들을 문자열 배열로 변경
		        String[] arr = new String[numbers.length];
		        for(int i=0;i<arr.length;i++) {
					 arr[i]=String.valueOf(numbers[i]);
				 }
		        //문자열의 길이로 비교하고 같다면 내림차순으로 정렬
//		        Collections.sort(list, (a, b) -> {
//		            String as = String.valueOf(a), bs = String.valueOf(b);
//		            return -Integer.compare(Integer.parseInt(as + bs), Integer.parseInt(bs + as));
//		        });
		        Arrays.sort(arr,new Comparator<String>(){
		    		public int compare(String s1, String s2){
		    			int r = Integer.compare(s1.length(), s2.length());
		    			if (r != 0) return r;
		    			return s2.compareTo(s1);
		    		}
		    	});
		        for(String s:arr) {
		        	answer.append(s);
		        }
		        return arr;
		    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {6, 10, 2};		
		String[] answer1 = solution(numbers);
		System.out.println("answer1="+Arrays.toString(answer1));
		int[] numbers2 = {35, 31,301, 300, 30 ,34};		
		String[] answer2 = solution(numbers2);
		System.out.println("answer2="+Arrays.toString(answer2));
		
		
	}

}
