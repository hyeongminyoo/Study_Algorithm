import java.io.*;

public class Main {
	
	public static boolean[] prime = new boolean[10001];
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int num = Integer.parseInt(br.readLine());
		getPrime();
		
		while(num-- > 0) {
			int n = Integer.parseInt(br.readLine());
			int first = n/2;
			int second = n/2;
			
			while(true) {
				if(!prime[first] && !prime[second]) {
					sb.append(first+" "+second+"\n");
					break;
				}
				
				first--;
				second++;
				
			}
			
		}
		
		System.out.println(sb);
		
	}
	
	
	public static void getPrime() {
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