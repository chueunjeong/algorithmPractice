package programmers;

public class DFS_BFS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {1,1,1,1,1};		
		// int answer1 = solution(numbers, 3);

		// System.out.println("answer1="+answer1);
		int[] numbers2 = {2,1,3};		
		int answer2 = solution(numbers2, 6 );
		System.out.println("answer2="+answer2);


	}
	public static void add(int[] numbers, int sum,int index, int target ,int count) {

		System.out.println("- ------------------------- --------------------------------- ");
		System.out.println("sum:"+sum+" ["+ index+"]"+"="+ numbers[index]+" count:"+count);
		System.out.println("sum+numbers[index] "+ (sum+ numbers[index]) +"\n" );
		if(( index+1 ) == numbers.length) {
			System.out.println("여기가 끝");
			return;
			}

		//양수
		add(numbers, sum+numbers[index],index+1,target,count);
		//음수
		minus(numbers, sum-numbers[index],index+1,target,count);


	}
	public static void minus(int[] numbers, int sum,int index, int target ,int count) {

		System.out.println("- ------------------------- --------------------------------- ");

		System.out.println("minus sum:"+sum+" ["+ index+"]"+"="+ numbers[index]+" count:"+count);
		System.out.println("minus sum-numbers[index] "+ (sum-numbers[index]) +"\n" );
		if(( index+1 ) == numbers.length) {
			System.out.println("여기가 끝");
			return;
			} 
		//양수
		add(numbers, sum+numbers[index],index+1,target,count);
		//음수
		minus(numbers, sum-numbers[index],index+1,target,count);


	}
	//	public static int add1(int[] numbers, int sum,int index, int target ) {
	//		
	//		int count = 0;
	//		
	//		return count; 
	//	
	//	}
	public static int solution(int[] numbers, int target) {
		int answer = 0;
		//int len = numbers.length;
		//int sum=0;
		add(numbers,0,0,target,0);
		return answer;
	}
}
