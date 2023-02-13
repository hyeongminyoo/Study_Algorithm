import java.io.*;
import java.util.Arrays;
import java.util.Comparator;


public class Main {
	
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		
		String [][] members = new String[n][2];
		
		for(int i=0; i<n; i++) {
			String [] str = br.readLine().split(" ");
			members[i][0] = str[0];
			members[i][1] = str[1];
		}
		
		Arrays.sort(members, new Comparator<String[]>() {
			@Override
			public int compare(String [] o1, String [] o2) {
				return Integer.parseInt(o1[0])-Integer.parseInt(o2[0]);
			}
		});
			
		
		for(int i=0; i<n; i++) {
			sb.append(members[i][0]+" "+members[i][1]+"\n");
		}
		
		System.out.println(sb);
		
			
	}
	
	
	
}