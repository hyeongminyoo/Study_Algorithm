import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String [][] arr = new String [5][15];
		for(int i=0; i<5; i++) {
			String [] str = br.readLine().split("");
			
			for(int j=0; j<str.length; j++) {
				arr[i][j] = str[j];
			}
			
		}
		
		for(int i=0; i<15; i++) {
			for(int j=0; j<5; j++) {
				if(arr[j][i] != null) {
					sb.append(arr[j][i]);
				}
			}
		}
		
		System.out.println(sb);
	}
	
}