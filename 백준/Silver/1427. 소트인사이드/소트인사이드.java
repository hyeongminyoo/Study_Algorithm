import java.io.*;
import java.util.Arrays;


public class Main {
	
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String [] str = br.readLine().split("");
		int [] result = new int[str.length];
		
		
		for(int i=0; i<str.length; i++) {
			int x = Integer.parseInt(str[i]);
			result[i] = x;
		}
		
		Arrays.sort(result);
		
		
		for(int i=result.length-1 ; i>=0; i--) {
			sb.append(result[i]);
		}
		
		
		System.out.println(sb);
		
		
	}
	
	
	
}