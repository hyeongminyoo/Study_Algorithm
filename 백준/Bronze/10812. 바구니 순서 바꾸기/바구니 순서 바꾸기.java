import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String [] str = br.readLine().split(" ");
		int n = Integer.parseInt(str[0]);
		int m = Integer.parseInt(str[1]);
		
		int [] basket = new int[n+1];
		
		for(int i=0; i<basket.length; i++) {
			basket[i] = i;
		}
		
		
		for(int i=0; i<m; i++) {
			str = br.readLine().split(" ");
			int begin = Integer.parseInt(str[0]);
			int end = Integer.parseInt(str[1]);
			int mid = Integer.parseInt(str[2]);
			
			
			int begin_tmp = begin;
			int [] tmp_arr = new int[n+1];
			
			
			
			for(int j=0; j<basket.length; j++) {
				tmp_arr[j] = basket[j];
			}
			
			for(int k=mid; k<=end; k++) {
				basket[begin++] = tmp_arr[k];
			}
			
			for(int x=begin_tmp; x<mid; x++) {
				basket[begin++] = tmp_arr[x];
			}
			
			
		}
		
		for(int i=1; i<basket.length; i++) {
			sb.append(basket[i]+" ");
		}
		
		System.out.println(sb);
		
	}
	
}