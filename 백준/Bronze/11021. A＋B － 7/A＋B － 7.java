import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int t = Integer.parseInt(br.readLine());
		
		for(int i=1; i<t+1; i++) {
			String str = br.readLine();
			int target = str.indexOf(" ");
			int result = Integer.parseInt(str.substring(0, target)) + Integer.parseInt(str.substring(target+1));
			sb.append("Case #"+i+": "+result+"\n");
		}
		
		System.out.println(sb);
		
	}	
}