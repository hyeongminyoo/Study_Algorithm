import java.io.*;
import java.util.Arrays;


public class Main {
	
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String [] str = br.readLine().split(" ");
		int n = Integer.parseInt(str[0]);
		int k = Integer.parseInt(str[1]);
		
		String [] str2 = br.readLine().split(" ");
		int [] scores = new int[n];
		for(int i=0; i<n; i++) {
			scores[i] = Integer.parseInt(str2[i]);
		}
		
		Arrays.sort(scores);
		
		System.out.println(scores[n-k]);
		
	}
	
	
	
}