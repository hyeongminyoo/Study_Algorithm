import java.io.*;

public class Main {
	
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());
		
		for(int i=0; i<t; i++) {
			int floor = Integer.parseInt(br.readLine());
			int ho = Integer.parseInt(br.readLine());
			
			int [] all = new int[ho];
			for(int j=1; j<all.length+1; j++) {
				all[j-1] = j;
			}
			
			for(int j=0; j<floor; j++) {
				int count = 0;
				for(int k=0; k<ho; k++) {
					count += all[k];
					all[k] = count;
				}
				if(j==(floor-1)) {
					sb.append(count+"\n");
				}
			}
			
			
		}
		
		System.out.println(sb);
	
	}
	
	
	
	
}