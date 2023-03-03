import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		long n = Integer.parseInt(br.readLine());
		
		long total = n-2;
		
		n = n-2;
		
		long count = 0;
		
		for(long i=1; i<= total; i++) {
			count += i*n;
			n--;
		}
		
		
		System.out.println(count);
		System.out.println(3);
		
	}
	
	
	
	
	
	
}