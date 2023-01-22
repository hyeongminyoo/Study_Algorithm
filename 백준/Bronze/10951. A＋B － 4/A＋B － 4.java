import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String input = "";
		
		while((input=br.readLine()) != null && !input.isEmpty()) {
			int target = input.indexOf(" ");
			int result = Integer.parseInt(input.substring(0, target)) + Integer.parseInt(input.substring(target+1));
			sb.append(result+"\n");
		}
		
		System.out.println(sb);
	}
}