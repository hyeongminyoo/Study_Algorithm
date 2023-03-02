import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int test = 0;
		
		while ((test = Integer.parseInt(br.readLine())) != -1) {
			
			int [] arr = new int [test];
			int i = 0;
			int div = 1;
			while(div <= test/2) {
				if(test%div == 0) {
					arr[i++] = div;
				}
				div++;
			}
			
			int sum = 0;
			int j = 0;
			while(arr[j] != 0) {
				
				sum += arr[j];
				j++;
			}
			
			sb.append(test);
			
			if(sum != test) {
				sb.append(" is NOT perfect.").append("\n");
				continue;
			}
			
			sb.append(" = "+ arr[0]);
			for(int k=1; ;k++) {
				if(arr[k] == 0 ) {
					sb.append("\n");
					break;
				}
				sb.append(" + ");
				sb.append(arr[k]);
				
			}
			
			
		}
		
		
		System.out.println(sb);
		
	}
	
}