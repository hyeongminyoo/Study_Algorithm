import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		String [] str = br.readLine().split(" ");
		int a = Integer.parseInt(str[0]);
		int b = Integer.parseInt(str[1]);
		int c = Integer.parseInt(str[2]);
		int award = 0;
		if(a == b && a==c) {
			award = 10000+ 1000*a;
		}else if(a == b || a==c || b==c) {
			if(a == b || a == c) {
				award = 1000+a*100;
			}else {
				award = 1000+100*b;
			}
		}else {
			if(a>b && a>c) {
				award = a*100;
			}else if(a<b && c<b) {
				award = b*100;
			}else {
				award = c*100;
			}
		}
		
		System.out.println(award);
		
	}
}
