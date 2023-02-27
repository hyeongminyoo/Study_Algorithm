import java.io.*;

public class Main {
	
	private static boolean [][] result;
	private static int min = 64;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String [] str = br.readLine().split(" ");
		int n = Integer.parseInt(str[0]);
		int m = Integer.parseInt(str[1]);

		result = new boolean[n][m];
		
		for(int i=0; i<n; i++) {
			String [] r = br.readLine().split("");
			for(int j=0; j<m; j++) {
				if(r[j].equals("B")) {
					result[i][j] = false;
				}else {
					result[i][j] = true;
				}
			}
		}
		
		int n_case = n-7;
		int m_case = m-7;
		
		for(int i=0; i<n_case; i++) {
			for(int j=0; j<m_case; j++) {
				getBoard(i,j);
			}
		}
		
		System.out.println(min);
		
		
	}
	
	public static void getBoard(int n_case, int m_case) {
		int n_length = n_case+8;
		int m_length = m_case+8;
		boolean check = result[n_case][m_case]; 
		
		int count = 0;
		
		for(int i=n_case; i<n_length; i++) {
			for(int j=m_case; j<m_length; j++) {
				if(check != result[i][j]) {
					count++;
				}
				check = !check;
			}
			check = !check;
		}
		
		count = Math.min(count, 64-count);
		
		min = Math.min(count, min);
		
	}
	
	
	
}