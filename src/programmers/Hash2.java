package programmers;

public class Hash2 {
	
	public static boolean solution(String[] phone_book) {
		 boolean answer = true;
	        //���̰� 1�� ��� �񱳴���� �����Ƿ�
	        if(phone_book.length ==1) return answer;
	        
	        for(int s=0;s<phone_book.length-1;s++){
	            
	            for(int k=0;k<phone_book.length;k++){
	                if(k==s) continue;               
	                
	                if(phone_book[k].startsWith(phone_book[s])){
	                    answer=false;
	                    break;
	                }
	            }
	            if(!answer) break;
	            
	        }
	        return answer;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���̽�1
		String[] book1= {"19", "97674223", "1195524421"};
		boolean answer1= solution(book1);
		System.out.println("answer1="+answer1);
	}

}
