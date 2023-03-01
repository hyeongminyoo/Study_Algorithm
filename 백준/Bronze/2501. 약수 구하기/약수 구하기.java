import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String [] str = br.readLine().split(" ");
		int n= Integer.parseInt(str[0]);
		int k = Integer.parseInt(str[1]);
		
		int count = 0;
		
		int divide = 1;
		
		boolean check = false;
		
		while(divide<=n) {
			
			if(n%(divide)==0) {
				count++;
				if(count == k) {
					check = true;
					break;
				}
			}
			divide++;		
		}
		
		
		System.out.println(check?divide:0);
		
	}
	
}