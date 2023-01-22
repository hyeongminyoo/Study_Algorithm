import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		int n = 0;
		int compare = num;
		
		while(true) {
			int a = compare/10;
			int b = compare%10;
			if(a+b >= 10) {
				compare = b*10 + (a+b)%10;
			}else {
				compare = b*10 + (a+b);
			}
			n++;
			if(num == compare) {
				break;
			}
		}
		
		System.out.println(n);
		
		
	}	
}