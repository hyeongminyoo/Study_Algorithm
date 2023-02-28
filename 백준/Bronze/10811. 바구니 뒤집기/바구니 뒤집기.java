import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String [] str = br.readLine().split(" ");
		
		int n = Integer.parseInt(str[0]);
		int m = Integer.parseInt(str[1]);
		
		int [] basket = new int[n+1];
		
		for(int i=0; i<basket.length; i++) {
			basket[i] = i;
		}
		
		
		
		for(int a=0; a<m; a++) {
			str = br.readLine().split(" ");
			int i = Integer.parseInt(str[0]);
			int j = Integer.parseInt(str[1]);
			
			int [] temp = new int[n+1];
			for(int c = 0; c<basket.length; c++) {
				temp[c] = basket[c];
			}
			int check = i;
			
			
			for(int b=j; b>=i; b--) {
				basket[b] = temp[check];
				check++;
			}
			
			
		}
		
		for(int i=1; i<basket.length; i++) {
			sb.append(basket[i]+" ");
		}
		
		System.out.println(sb);
		
	}
	
}