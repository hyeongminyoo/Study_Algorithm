import java.io.*;
public class Main {
	
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int a1 = 0;
		int a2 = 1;
		int result = fibonacci(n, a1, a2);
		
		System.out.println(result);
		
	}
	
	
	public static int fibonacci(int n, int a1, int a2) {
		if(n > 2) {
			n--;
			int b = a1;
			a1 = a2;
			a2 += b;
			return fibonacci(n, a1, a2);  
		}else if(n == 0){
			return 0;
		}else {
			return a1+a2;
		}
	}
	
	
	
}