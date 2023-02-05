import java.io.*;

public class Main {
	
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x = Integer.parseInt(br.readLine());
		int range = 3;
		int t = 3;
		
		if(x == 1) {
			System.out.println("1/1");
		}else {
			while(true) {
				if(x<=range) {
					int first = range - (t-2);
					int number = x-first;						
					if(t%2 != 0) {
						System.out.println((number+1)+"/"+(t-1-number));
						break;
					}else {
						System.out.println((t-1-number)+"/"+(number+1));
						break;
					}
				}else {
					range = range+t;
					t++;
				}
			}
		}
			
		
		
	
	}
	
	
	
	
}