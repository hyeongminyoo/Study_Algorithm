import java.io.*;
import java.util.StringTokenizer;
public class Main {
	
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		int len = str.length();
		int n = Integer.parseInt(str);
		
		int result = 0;
		for(int i=(n-(len*9)); i<n; i++) {
			int num = i;
			int sum = 0;
			while(num !=0) {
				sum += num%10;
				num /= 10;
			}
			
			if(sum + i == n) {
				result = i;
				break;
			}
			
		}
		
		System.out.println(result);
				
	}
	
	
	
}