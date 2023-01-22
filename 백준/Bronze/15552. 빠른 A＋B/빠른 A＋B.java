import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		long t = Long.parseLong(br.readLine());
		for(long i=0; i<t; i++) {
			String [] str = br.readLine().split(" ");
			bw.write(Integer.parseInt(str[0])+Integer.parseInt(str[1])+"\n");
		}
		
		bw.flush();
		bw.close();
		
	}	
}