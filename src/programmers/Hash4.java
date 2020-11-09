package programmers;
import java.util.*;
import java.util.ArrayList;

class Song {
	int index;
	int num;
	
	public Song(int index, int num) {
		super();
		this.index = index;
		this.num = num;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	@Override
	public String toString() {
		return "Song [index=" + index + ", num=" + num + "]";
	}
	
}

public class Hash4 {
	public static int[] solution(String[] genres, int[] plays) {
		int[] answer = {};       
        //많이 재생된 장르 비교하기
        Map<String, Integer> map = new HashMap<String, Integer>();
        for(int i=0;i<genres.length;i++) map.put(genres[i],map.getOrDefault(genres[i],0)+plays[i]);
        
        List<String> keySetList = new ArrayList<>(map.keySet());
        // 내림차순
		Collections.sort(keySetList, (o1, o2) -> (map.get(o2).compareTo(map.get(o1))));
       
		
        //해당 장르 중에 많이 재생된 2개 뽑기
		//단, 같을 경우 인덱스가 낮은 거 먼저
		List<Integer> answerList = new ArrayList<>();
		for(String key:keySetList) {
			List<Song> songList = new ArrayList<>();
			for(int i=0;i<genres.length;i++){				
				if(genres[i]==key) songList.add(new Song(i,plays[i]));				
			}
						
			songList.sort(Comparator.comparing(Song::getNum).reversed().thenComparing(Song::getIndex));
			answerList.add(songList.get(0).getIndex());
			if(songList.size()>1) answerList.add(songList.get(1).getIndex());			
		}
		
		answer = answerList.stream().mapToInt(i->i).toArray();
		
		
        return answer;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] genres = {"classic", "pop", "classic", "classic", "pop"};
		int[] plays = {500, 600, 150, 800, 2500};
		int[] answer1 = solution(genres, plays);
		System.out.println("answer1="+Arrays.toString(answer1));
		
		String[] genres2 = {"a", "b", "c", "a", "a"};
		int[] plays2 = {500, 600, 150, 800, 2500};
		int[] answer2 = solution(genres2, plays2);
		System.out.println("answer2="+Arrays.toString(answer2));
		
	}

}
