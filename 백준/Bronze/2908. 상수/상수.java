import java.io.*;


public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String [] str = br.readLine().split(" ");
		
		String [] a = str[0].split("");
		String [] b = str[1].split("");
		
		int first = Integer.parseInt(a[2])*100+Integer.parseInt(a[1])*10+Integer.parseInt(a[0]);
		int second = Integer.parseInt(b[2])*100+Integer.parseInt(b[1])*10+Integer.parseInt(b[0]);
		
		int result = first>second?first : second;
		
		System.out.println(result);
		
		
		
	}
	
}