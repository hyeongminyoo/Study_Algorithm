import java.io.*;

public class Main {
	
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		boolean [][] duplicate = new boolean[100][100];
		int count = 0;
		
		
		for(int i=0; i<n; i++) {
			String [] str = br.readLine().split(" ");
			int x = Integer.parseInt(str[0]);
			int y = Integer.parseInt(str[1]);
			
			
			for(int j=x;j<x+10; j++) {
				for(int k=y; k<y+10; k++) {
					if(duplicate[j][k]) {
						count++;
					}else {
						duplicate[j][k] = true;
					}
				}
			}		
			
		}
		
		System.out.println(n*100-count);
		
	}
	
	
	
}