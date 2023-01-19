import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String [] str = br.readLine().split(" ");
		int a = Integer.parseInt(str[0]);
		int b = Integer.parseInt(str[1]);
		
		String result = "";
		
		if(a>b) {
			result = ">";
		}else if(a<b) {
			result = "<";
		}else {
			result = "==";
		}
		
		System.out.println(result);
		
	}
}