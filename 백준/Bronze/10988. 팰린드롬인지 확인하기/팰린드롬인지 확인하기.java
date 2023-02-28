import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		int last_index = str.length()-1;
		int first_index = 0;
		
		boolean check = true;
		while(first_index<=last_index) {
			if(str.charAt(first_index)!=str.charAt(last_index)) {
				check = false;
			}
			first_index++;
			last_index--;
			
		}
		
		System.out.println(check?1:0);
		
		
	}
	
}