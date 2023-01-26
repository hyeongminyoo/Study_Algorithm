import java.io.*;


public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int [] students = new int[31];
		for(int i=0; i<28; i++) {
			students[Integer.parseInt(br.readLine())] = 1;
		}
		
		for(int i=1; i<31; i++) {
			if(students[i] == 0) {
				System.out.println(i);
			}
		}
		
	}	
}