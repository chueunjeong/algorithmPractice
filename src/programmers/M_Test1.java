package programmers;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class M_Test1 {
	
	public static int[] solution(String logs) {
		String regex="[0-9]{2}:[0-9]{2}:[0-9]{2}";
		Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(logs);
        List<String> logList =new ArrayList<>();
        int[] answer = new int[24];
        while (matcher.find())
            logList.add(matcher.group(0));
        for(String s:logList) {
        	int hour = Integer.parseInt(s.substring(0, 2))+9;
        	if(hour>24) hour-=24;
        	answer[hour]=answer[hour]+1;        	
        }
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String logs = "2019/05/01 00:59:19" + 
				"2019/06/01 01:35:20" + 
				"2019/08/01 02:01:22" + 
				"2019/08/01 02:01:23" + 
				"2019/08/02 03:02:35" + 
				"2019/10/03 04:05:40" + 
				"2019/10/04 06:23:10" + 
				"2019/10/10 08:23:20" + 
				"2019/10/12 08:42:24" + 
				"2019/10/23 08:43:26" + 
				"2019/11/14 08:43:29" + 
				"2019/11/01 10:19:02" + 
				"2019/12/01 11:23:10";
		System.out.println("answer="+solution(logs));

	}

}
