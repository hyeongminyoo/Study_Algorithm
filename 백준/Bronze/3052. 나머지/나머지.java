import java.io.*;


public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int [] nums = new int[10];
		int [] remainders = new int[10];
		int count = 0;
		for(int i=0; i<10; i++) {
			nums[i] = Integer.parseInt(br.readLine());
			remainders[i] = nums[i]%42;
		}
		
		for(int i=0; i<remainders.length; i++) { 
			for(int k = i+1; k<remainders.length; k++) {
				if(remainders[i] == remainders[k]) {
					count++;
					break;
				}
			}
		}
		System.out.println(10-count);
	}	
}