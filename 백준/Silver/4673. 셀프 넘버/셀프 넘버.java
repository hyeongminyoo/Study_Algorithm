import java.io.*;


public class Main {
	
	public static void main(String[] args) throws IOException {
		StringBuilder sb = new StringBuilder();
		boolean [] nums = new boolean [10001];
		for(int i=1; i<10001; i++) {
			if(d(i)>10000) {
				continue;
			}
			nums[d(i)] = true; 
		}
		
		for(int i=1; i<10001; i++) {
			if(!nums[i]) {
				sb.append(i+"\n");
			}
		}
		
		System.out.println(sb);
	}
	
	
	static int d(int i) {
		int result = -1;
		if(i/1000>=1) {
			int thou = i/1000;
			int hund = (i-(thou*1000))/100;
			int ten = (i-(thou*1000)-(hund*100))/10;
			int one = i-(thou*1000)-(hund*100)-(ten*10);
			result = i+thou+hund+ten+one;
		}else {
			if(i/100>=1) {
				int hund = i/100;
				int ten = (i-(hund*100))/10;
				int one = i-(hund*100)-(ten*10);
				result = i+hund+ten+one;
			}else {
				if(i/10>=1) {
					int ten = i/10;
					int one = i-(ten*10);
					result = i+ten+one;
				}else {
					result = i+i;
				}
			}
		}
		return result;
	}
}