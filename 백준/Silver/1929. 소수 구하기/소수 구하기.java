import java.io.*;

public class Main {
	
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String [] str = br.readLine().split(" ");
		int m = Integer.parseInt(str[0]);
		int n = Integer.parseInt(str[1]);
		
		boolean [] prime = new boolean[n+1];
		
		getPrime(prime);
		
		for(int i=m; i<= n; i++) {
			if(!prime[i]) {
				sb.append(i+"\n");
			}
		}
		
		System.out.println(sb);
		
	}
	
	
	public static void getPrime(boolean [] prime) {
		prime[0] = true;
		prime[1] = true;
		
		for(int i=2; i<= Math.sqrt(prime.length); i++) {
			if(prime[i]) continue;
			for(int j= i*i; j<prime.length; j+=i) {
				prime[j] = true;
			}
			
		}
		
	}
	
	
}