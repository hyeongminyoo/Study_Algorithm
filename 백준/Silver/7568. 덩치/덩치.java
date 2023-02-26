import java.io.*;

public class Main {
	
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		
		int [][] all = new int[n][2];
		
		for(int i=0; i<n; i++) {
			String [] str = br.readLine().split(" ");
			all[i][0] = Integer.parseInt(str[0]);
			all[i][1] = Integer.parseInt(str[1]);
		}
		
		
		for(int i=0; i<n; i++) {
			int rank = 1;
			for(int j=0; j<n; j++) {
				if(i == j) {
					continue;
				}
				
				if(all[i][0] < all[j][0] && all[i][1] < all[j][1] ) {
					rank++;
				}
				
			}
			
			sb.append(rank).append(" ");
			
		}
		
		
		System.out.println(sb);
		
	}
	
	
	
}