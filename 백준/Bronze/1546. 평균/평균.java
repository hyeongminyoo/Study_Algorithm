import java.io.*;


public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		double [] ori = new double[n];
		double max = 0;
		double sum = 0;
		String [] strs = br.readLine().split(" ");
		for(int i=0; i<n; i++) {
			ori[i] = Double.parseDouble(strs[i]);
		}
		
		for(int i=0; i<n; i++) {
			if(max < ori[i]) {
				max = ori[i];
			}
		}
		
		
		for(int i=0; i<n; i++) {
			ori[i] = (ori[i]/max)*100;
			sum += ori[i];
		}
		
		System.out.println(sum/n);
		
	}	
}