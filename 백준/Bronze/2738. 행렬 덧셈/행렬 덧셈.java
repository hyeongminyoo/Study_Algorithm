import java.io.*;

public class Main {
	
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String [] str = br.readLine().split(" ");
		int n = Integer.parseInt(str[0]);
		int m = Integer.parseInt(str[1]);
		
		int [][] result = new int[n][m];
		
		for(int i=0; i<2; i++) {
			for(int j=0; j<n; j++) {
				String [] num = br.readLine().split(" ");
				for(int k=0; k<m; k++) {
					  result[j][k] += Integer.parseInt(num[k]);
					  if(i == 1) {
						  if(k == m-1) {
							  sb.append(result[j][k] + "\n");
						  }else {
							  sb.append(result[j][k] + " ");
						  }
					  }
				}
			}
		}
		
		System.out.println(sb);
		
	
	}
	
	
	
	
}