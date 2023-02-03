import java.io.*;

public class Main {
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) throws IOException {
		int n = Integer.parseInt(br.readLine());
		int count = 0;
		for(int i=0; i<n; i++) {
			if(check(br.readLine().split(""))) {
				count++;
			}
		}
		
		System.out.println(count);
	}
	
	
	public static boolean check(String [] str) throws IOException {
		boolean[] check = new boolean[26];
		int prev = 0;
		for(int i=0; i<str.length; i++) {
			int now = str[i].charAt(0);
			//앞선 문자와 i 번째 문자가 같지않으면
			if(prev != now) {
				//해당 문자가 처음 나오는 경우(false)
				if(check[now-'a']==false) {
					check[now-'a']=true;
					prev = now;
				}
				else {
					return false;
				}
			}else {
				continue;
			}
			
		}
		
		return true;
	}
	
	
}