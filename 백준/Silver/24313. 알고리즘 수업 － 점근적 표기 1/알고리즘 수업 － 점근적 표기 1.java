import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String [] str = br.readLine().split(" ");
		
		int a1 = Integer.parseInt(str[0]);
		
		int a0 = Integer.parseInt(str[1]);
		
		int c = Integer.parseInt(br.readLine());
		int n0 = Integer.parseInt(br.readLine());
		
		int check = 1;
		
		for(int i = n0; i<= 100; i++) {
			if(fn(i,a1,a0) > c*i) {
				check = 0;
				break;
			}
		}
		
		System.out.println(check);
		
		
	}
	
	
	
	public static int fn(int n, int a1, int a0) {
		return a1*n + a0;
	}
	
	
	
	
	
}