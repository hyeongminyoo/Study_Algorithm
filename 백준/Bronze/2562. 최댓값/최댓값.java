import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int [] nums = new int[9];
		int max = 0;
		int length = 0;
		for(int i = 0; i<9; i++) {
			nums[i] = Integer.parseInt(br.readLine());
			if(max<nums[i]) {
				max = nums[i];
				length = i+1;
			}
		}
		System.out.println(max + "\n" + length);
	}	
}