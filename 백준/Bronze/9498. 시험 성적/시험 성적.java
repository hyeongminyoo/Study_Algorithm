import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		int a = Integer.parseInt(br.readLine())/10;
		String result = "";
		switch(a) {
		case 10:
			result = "A";
			break;
		case 9:
			result = "A";
			break;
		case 8:
			result = "B";
			break;
		case 7:
			result = "C";
			break;
		case 6:
			result = "D";
			break;
		default:
			result = "F";
			break;
		}
		System.out.println(result);
		
	}
}
