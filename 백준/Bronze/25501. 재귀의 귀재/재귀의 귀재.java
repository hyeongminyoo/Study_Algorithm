import java.io.*;
public class Main {
	
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		for(int i=0; i<n; i++) {
			String s = br.readLine();
			int [] count = new int[2];
			count = isPalindrome(s, count);
			sb.append(count[0]+" "+count[1]+"\n");
		}
		
		System.out.println(sb);
				
	}
	
	
	public static int [] recursion(String s, int l, int r, int [] count) {
		if(l >=r) {
			count[1]++;
			count[0] = 1;
			return count;
		}
		else if(s.charAt(l) != s.charAt(r)) {
			count[1]++;
			count[0] = 0;
			return count;
		}
		else {
			count[1]++;
			return recursion(s, l+1, r-1, count);
		}
	}
	
	
	
	public static int [] isPalindrome(String s, int [] count) {
		return recursion(s, 0, s.length()-1, count);
	}
	
	
	
}