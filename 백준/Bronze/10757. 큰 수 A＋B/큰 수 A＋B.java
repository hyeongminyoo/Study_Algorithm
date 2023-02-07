import java.io.*;

public class Main {
	
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String [] str = br.readLine().split(" ");
		int max_length = Math.max(str[0].length(), str[1].length());
		
		int [] a = new int[max_length+1];
		int [] b = new int[max_length+1];
		
		for(int i = str[0].length()-1, idx=0; i>=0; i--, idx++) {
			a[idx] = str[0].charAt(i)-'0';
		}
		
		for(int i=str[1].length()-1, idx = 0; i>=0; i--, idx++) {
			b[idx] = str[1].charAt(i)-'0';
		}
		
		for(int i=0; i<max_length; i++) {
			int value = a[i] + b[i];
			a[i] = value %10;
			a[i+1] += (value/10);
		}
		
		StringBuilder sb = new StringBuilder();
		if(a[max_length] != 0) {
			sb.append(a[max_length]);
		}
		
		for(int i=max_length -1 ; i>= 0; i--) {
			sb.append(a[i]);
		}
		
		System.out.println(sb);
		
	}
}