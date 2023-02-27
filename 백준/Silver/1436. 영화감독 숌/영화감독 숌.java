import java.io.*;

public class Main {
	
	public static String [] str;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int check = 666;
		
		int count = 1;
		
		while(count != n) {
			check++;
			if(String.valueOf(check).contains("666")) {
				count++;
			}
		}
		
		System.out.println(check);
		
		
		
		
	}
	
	
	
	
}