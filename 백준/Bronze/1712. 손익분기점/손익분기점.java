import java.io.*;

public class Main {
	
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String [] str = br.readLine().split(" ");
		long a = Integer.parseInt(str[0]);
		long b = Integer.parseInt(str[1]);
		long c = Integer.parseInt(str[2]);
		
		if(b-c >= 0) {
			System.out.println(-1);
		}else {
			System.out.println((a/(b-c))*(-1)+1);
		}
		
		
	}
	
	
	
	
}