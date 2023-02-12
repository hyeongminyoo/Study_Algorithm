import java.io.*;


public class Main {
	
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int [] nums = new int[8001];
		int sum = 0;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int median = 0;
		int mode = 0;
		
		
		for(int i =0; i<n ; i++) {
			int num = Integer.parseInt(br.readLine());
			sum += num;
			nums[num+4000]++;
			
			if(max < num) {
				max = num;
			}
			
			if(min > num) {
				min = num;
			}
			
		}
		
		int count = 0;
		int mode_max = 0;
		
		boolean flag = false;
		
		for(int i = min+4000; i<= max+4000; i++) {
			if(nums[i]>0) {
				if(count < (n+1)/2) {
					count += nums[i];
					median = i-4000;
				}
				
				/*
				 * 이전 최빈값 보다 현재 값의 빈도수가 더 높다면
				 * 최빈값의 최대값(갯수)에 현재 값의 빈도수를 대입
				 * 이번 최댓값이 첫 등장이므로 true 
				 */
				
				if(mode_max < nums[i]) {
					mode_max = nums[i];
					mode = i-4000;
					flag = true;
					// 이전 최빈값의 갯수와 동일한 경우이면서 한번만 중복되는 경우 
				}else if(mode_max == nums[i] && flag == true) {
					mode = i-4000;
					flag = false;
				}
				
				
			}
			
			
		}
		
		System.out.println((int)Math.round((double)sum/n));
		System.out.println(median);
		System.out.println(mode);
		System.out.println(max-min);
	
		
		
	}
	
	
	
}