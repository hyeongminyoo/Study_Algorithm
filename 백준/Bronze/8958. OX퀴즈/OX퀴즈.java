import java.io.*;
import java.util.StringTokenizer;


public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		for(int i=0; i<n; i++) {
			int sum=0;
			StringTokenizer st = new StringTokenizer(br.readLine(), "X");
			while(st.hasMoreTokens()) {
				int count = st.nextToken().length();
				for(int k=1; k<count+1; k++) {
					sum += k;
				}
			}
			bw.write(sum+"\n");
		}
		bw.flush();
		bw.close();
	}	
}