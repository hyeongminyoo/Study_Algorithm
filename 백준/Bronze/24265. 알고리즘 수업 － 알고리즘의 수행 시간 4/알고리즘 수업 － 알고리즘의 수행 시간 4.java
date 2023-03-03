import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		long n = Integer.parseInt(br.readLine());
		
		
		long count = 0;
		
		for(int i = 1; i<=n-1; i++) {
			count += n-i;
		}
		
		
		System.out.println(count);
		System.out.println(2);
		
		
		
	}
	
	
	
	
	
	
}