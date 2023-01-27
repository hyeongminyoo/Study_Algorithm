import java.io.*;


public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String [] str = br.readLine().split("");
		for(char i = 'a'; i<123; i++) {
			for(int j=0; j<str.length; j++) {
				if(str[j].charAt(0) == i) {
					sb.append(j+" ");
					break;
				}else {
					if(j==str.length-1) {
						sb.append(-1+" ");
					}
				}
				
			}
			
		}
		System.out.println(sb);
	}
	
}