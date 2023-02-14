import java.io.*;
import java.util.Arrays;
import java.util.HashMap;

public class Main {
	
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		String [] str = br.readLine().split(" ");
		int [] origin = new int[n];
		int [] sorted = new int[n];
		
		HashMap<Integer, Integer> rankingMap = new HashMap<>();
		
		for(int i=0; i<n; i++) {
			origin[i] = sorted[i] = Integer.parseInt(str[i]);
		}
		
		Arrays.sort(sorted);
		
		int rank = 0;
		
		for(int x : sorted) {
			if(!rankingMap.containsKey(x)) {
				rankingMap.put(x, rank);
				rank++;
			}
		}
		
		
		for(int key : origin) {
			int ranking = rankingMap.get(key);
			sb.append(ranking).append(' ');
		}
		
		System.out.println(sb);
	}
	
	
	
}