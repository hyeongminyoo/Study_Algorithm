import java.io.*;


public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int count = Integer.parseInt(br.readLine());
		String [] num = br.readLine().split("");
		int sum=0;
		for(int i=0 ; i<count; i++) {
			sum += Integer.parseInt(num[i]);
		}
		
		System.out.print(sum);
	}
	
}