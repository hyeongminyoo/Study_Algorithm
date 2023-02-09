import java.io.*;

public class Main {
	
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int num = Integer.parseInt(br.readLine());
		
		for(int i =0; i<num; i++) {
			int n = Integer.parseInt(br.readLine());
			boolean [] prime = new boolean[n];
			getPrime(prime);
			int minus = Integer.MAX_VALUE;
			int first = 0;
			int second = 0;
			
			for(int j=n-1; j>1; j--) {
				if(!prime[j]) {
					int k = n-j;
					if(!prime[k]) {
						if(minus > j-k && j-k>=0) {
							minus = j-k;
							first = k;
							second = j;
						}
					}
				}
				
			}
			
			sb.append(first+" "+second+"\n");
			
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