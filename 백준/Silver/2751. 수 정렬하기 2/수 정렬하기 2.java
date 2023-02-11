import java.io.*;


public class Main {
	
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		boolean [] check = new boolean[2000001];
		
		for(int i=0; i<n; i++) {
			check[Integer.parseInt(br.readLine())+1000000] = true; 
		}
		
		for(int i=0; i<2000001; i++) {
			if(check[i]) {
				sb.append(i - 1000000).append("\n");
			}
		}
		
		System.out.println(sb);
	}
	
	
	
}