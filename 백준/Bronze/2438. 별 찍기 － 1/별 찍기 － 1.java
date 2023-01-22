import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i = 1; i<n+1; i++) {
			for(int j = 0; j<i; j++) {
				sb.append("*");
				if(j == i-1) {
					sb.append("\n");
				}
			}
		}
		
		System.out.println(sb);
	}
}