package programmers;
import java.util.Arrays;
public class Sort1 {
	
	public static int[] solution(int[] array, int[][] commands) {
        int[] answer = {};
        int com_len = commands.length;
        answer = new int[com_len];
        for(int i=0;i<com_len;i++){
            int[] temp = Arrays.copyOfRange(array,commands[i][0]-1,commands[i][1]);
            Arrays.sort(temp);           
            answer[i]=temp[commands[i][2]-1];
        }
        return answer;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1, 5, 2, 6, 3, 7, 4};
		int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		int[] answer1 = solution(array, commands);
		System.out.println("answer1="+Arrays.toString(answer1));
	}

}
