import java.io.*;
import java.util.Arrays;


public class Main {
	
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		
		int [][] xy = new int[n][2];
		
		for(int i=0; i<n; i++) {
			String [] str = br.readLine().split(" ");
			int x = Integer.parseInt(str[0]);
			int y = Integer.parseInt(str[1]);
			
			xy[i][0] = x;
			xy[i][1] = y;
			
		}
		
		Arrays.sort(xy, (e1,e2) -> {
			if(e1[0] == e2[0]) {
				return e1[1] - e2[1];
			}else {
				return e1[0] - e2[0];
			}
		}); 
		
		for(int i=0; i<n; i++) {
			sb.append(xy[i][0]+" "+xy[i][1]+"\n");
		}
		
		System.out.println(sb);
		
	}
	
	
	
}