import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String [] str = br.readLine().split(" ");
		int n = Integer.parseInt(str[0]);
		int m = Integer.parseInt(str[1]);
		
		int [] basket = new int[n];
		
		for(int a=0; a<m; a++) {
			str = br.readLine().split(" ");
			int i = Integer.parseInt(str[0]);
			int j = Integer.parseInt(str[1]);
			int k = Integer.parseInt(str[2]);
			
			for(int b=i-1; b<j ; b++) {
				basket[b] = k;
			}
			
		}
		
		
		for(int i=0; i<basket.length; i++) {
			sb.append(basket[i]+" ");
		}
		
		
		System.out.println(sb);
		
	}
	
}