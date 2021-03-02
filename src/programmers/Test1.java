package programmers;
import java.util.*;


public class Test1 {
	
	public static List<List<Integer>>  search(int[] arr,int index) {
		List<List<Integer>>  arrList = new ArrayList<List<Integer>>();
		List<Integer> list = new ArrayList<>();
		list.add(arr[index]);
		if((index+1)!=arr.length) return search2(arr,index,list); 
		else {
			arrList.add(list);
			return arrList;
		}
	}
	

	private static List<List<Integer>> search2(int[] arr, int start, List<Integer> list ) {
		List<List<Integer>> arrList =new ArrayList<List<Integer>>();
		
		for(int i=start+1;i<arr.length;i++) {		
			
			if(arr[i]>arr[start]) {				
				list.add(arr[i]);
				
				search2(arr,i,list);	
				
				
			}
			//else continue;
		}
		arrList.add(list);
		return arrList;
		
		
	}
	
	


	public static int [] solution(int []cookies, int k)
    {
        int []answer = new int[1];
        int count=0;
        for(int i=0;i<cookies.length;i++) {
        	List<List<Integer>> List = new ArrayList<List<Integer>>();
        	List=search(cookies,i);
        	System.out.println("result="+Arrays.toString( List.toArray()) );
        }
        
        return answer;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] cookies = {1,4,2,6,5,3};
		int k= 2;
		int[] answer1 = solution(cookies,k);
		System.out.println("answer1=[1,2,5]"+Arrays.toString(answer1));
		
		
		
		

	}

}
