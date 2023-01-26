import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long n = Long.parseLong(br.readLine());
		String [] strs = br.readLine().split(" ");
		
		long max = Long.parseLong(strs[0]);
		long min = Long.parseLong(strs[0]);
		
		for(int i=0; i<n; i++) {
			if(max < Long.parseLong(strs[i])) {
				max = Long.parseLong(strs[i]);
			}
			if(min > Long.parseLong(strs[i])) {
				min = Long.parseLong(strs[i]);
			}
		}
		
		System.out.println(min+" "+max);
	}	
}