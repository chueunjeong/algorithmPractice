package codingTest;

public class Implementation01 {
	public static String solution(int n,char[] directions) {
		int[] position= {1,1};
		for(int i=0;i<directions.length;i++) {
			if((position[1]+1)<n && directions[i]=='R') position[1]++;
			if((position[1]-1)>0 && directions[i]=='L') position[1]--;
			if((position[0]-1)>0 && directions[i]=='U') position[0]--;
			if((position[0]+1)<n && directions[i]=='D') position[0]++;			
		}
		return position[0]+" "+position[1];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] arr1= {'R','R','R','U','D','D'};
		String answer1 =solution(5,arr1);
		System.out.println("answer1=(3,4) =>"+answer1);
		
	}

}
