import java.io.*;

public class Main {
	
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		for(int i = 0; i<n ; i++) {
			String [] str = br.readLine().split(" ");
			int h = Integer.parseInt(str[0]);
			int w = Integer.parseInt(str[1]);
			int num = Integer.parseInt(str[2]);
			int count = 0;
			
			for(int j=0; j<w; j++) {
				for(int k=0; k<h; k++) {
					count++;
					if(count == num) {
						sb.append(((100*(k+1))+(j+1))+"\n");
						break;
					}
				}
			}
			
		}
			
		
		System.out.println(sb);
	
	}
	
	
	
	
}