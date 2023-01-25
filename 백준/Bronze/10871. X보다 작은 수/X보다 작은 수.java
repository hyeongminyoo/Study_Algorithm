import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String [] strs = br.readLine().split(" ");
		int n = Integer.parseInt(strs[0]);
		int x = Integer.parseInt(strs[1]);
		String [] strs2 = br.readLine().split(" ");
		for(int i=0; i<n; i++) {
			if(Integer.parseInt(strs2[i]) < x) {
				sb.append(strs2[i]+" ");
			} 
		}
		System.out.println(sb);
	}	
}