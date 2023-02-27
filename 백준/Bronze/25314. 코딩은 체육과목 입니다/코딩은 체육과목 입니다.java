import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		String result = "long";
		
		for(int i=4; i<n; i += 4) {
			result = result + " long";
		}
		
		System.out.println(result + " int");
		
	}
	
}