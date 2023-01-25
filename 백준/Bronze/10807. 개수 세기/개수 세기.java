import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		String [] strs = br.readLine().split(" ");
		Integer [] nums = new Integer[num];
		int compare = Integer.parseInt(br.readLine());
		int length = 0;
		for(int i =0; i<num ; i++) {
			nums[i] = Integer.parseInt(strs[i]);
			if(nums[i] == compare) {
				length++;
			}
		}
		
		System.out.println(length);
		
		
	}	
}