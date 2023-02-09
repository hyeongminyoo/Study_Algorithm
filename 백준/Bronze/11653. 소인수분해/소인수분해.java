import java.io.*;

public class Main {
	
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		
		for(int i=2; i<=n;) {
			if(n%i == 0) {
				sb.append(i+"\n");
				n = n/i;
			}else {
				i++;
			}
		}
		
		System.out.println(sb);
		
	}
	
}