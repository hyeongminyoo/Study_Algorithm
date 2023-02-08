import java.io.*;

public class Main {
	
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int m = Integer.parseInt(br.readLine());
		int n = Integer.parseInt(br.readLine());
		
		int sum = 0;
		int min = 0;
			
		for(int i=m; i<n+1; i++) {
			
			boolean check = true;
            
            if(i == 1) {
				check = false;
			}
            
			for(int j=2; j<=Math.sqrt(i); j++) {
				if(i%j ==0 ) {
					check = false;
					break;
				}
			}
			
			
			
			if(check) {
				if(sum == 0) {
					sum += i;
					min = i;
				}else {
					sum += i;
				}
			}
			
		}
		
		
		if(sum==0) {
			System.out.println(-1);
		}else {
			System.out.println(sum);
			System.out.println(min);
		}
		
		
	}
		
}