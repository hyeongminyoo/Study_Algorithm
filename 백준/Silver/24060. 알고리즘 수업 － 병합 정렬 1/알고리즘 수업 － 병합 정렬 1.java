import java.io.*;
public class Main {
	
	static int[] tmp;
	static int count = 0;
	static int result = -1;
	static int k;
	
	
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String [] str = br.readLine().split(" ");
		int n = Integer.parseInt(str[0]);
		k = Integer.parseInt(str[1]);
		
		tmp = new int[n];
		
		int [] nums = new int[n];
		str = br.readLine().split(" ");
		for(int i=0; i<str.length; i++) {
			nums[i] = Integer.parseInt(str[i]);
		}
		
		merge_sort(nums, 0, nums.length-1);
		
		System.out.println(result);
		
				
	}
	
	public static void merge_sort(int [] nums, int start, int end) {
		if(start<end) {
			int mid = (start+end)/2;
			merge_sort(nums, start,mid); // 전반부 정렬
			merge_sort(nums, mid+1 ,end); // 후반부 정렬
			merge(nums,start,mid,end);
		}
	}
	
	

	public static void merge(int [] nums, int start, int mid, int end) {
		int i = start;
		int j = mid+1;
		int t =0;
		
		//A배열에서 비교하고 작은쪽 tmp 배열에 저장
		while(i <= mid && j<= end) {
			if(nums[i] <= nums[j]) {
				tmp[t++] = nums[i++];
			}else {
				tmp[t++] = nums[j++];
			}
		}
		
		while(i<= mid) {
			tmp[t++] = nums[i++];
		}
		
		while(j<= end) {
			tmp[t++] = nums[j++];
		}
		
		i = start;
		t = 0;
		
		while(i<= end) {
			count ++;
			if(count == k) {
				result = tmp[t];
				break;
			}			
			nums[i++] = tmp[t++];
		}
		
	}
	
	
}