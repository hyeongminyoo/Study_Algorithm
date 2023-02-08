import java.io.*;

public class Main {
	
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String [] str = br.readLine().split(" ");
		int count = 0;
		
		for(int i=0; i<n; i++) {
			int x = Integer.parseInt(str[i]);
			
			boolean isPrime = true;
			
			if(x == 1) {
				continue;
			}
			
			for(int j=2; j<= Math.sqrt(x); j++) {
				if(x % j == 0) {
					isPrime = false;
					break;
				}
			}
			
			if(isPrime) {
				count++;
			}
			
			
		}
		
		System.out.println(count);
		
	}
		
}