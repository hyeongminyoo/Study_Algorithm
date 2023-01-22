import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		long total = Long.parseLong(br.readLine());
		int total_count = Integer.parseInt(br.readLine());
		
		long cal = 0;
		String result = "Yes";
		for(int i = 0; i < total_count; i++) {
			String str[] = br.readLine().split(" ");
			long price = Long.parseLong(str[0]);
			int count = Integer.parseInt(str[1]);
			cal += price*count;
			
			if(i == total_count-1) {
				if(cal != total) {
					result = "No";
				}
			}
			
		}
		
		System.out.println(result);
		
		

	}	
}