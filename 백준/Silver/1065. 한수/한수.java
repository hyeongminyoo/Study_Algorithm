import java.io.*;


public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int result = count(n);
		
		System.out.println(result);
		
	}
	
	
	static int count(int n) {
		int count = 0;

		if(n<100) {
			count = n;
		}else if(n>=100){
			count = 99;
			for(int i=n; i>99; i--) {
				int hund = i/100;
				int ten = (i-(100*hund))/10;
				int one = i-(100*hund)-(10*ten);
				if((hund-ten) == (ten-one)) {
					count++;
				}
			}
		}else {
			count = 99;
			for(int i=999; i>99; i--) {
				int hund = i/100;
				int ten = (i-(100*hund))/10;
				int one = i-(100*hund)-(10*ten);
				if((hund-ten) == (ten-one)) {
					count++;
				}
			}
			for(int i=n; i>99; i--) {
				int thoud = i/1000;
				int hund = (i-(1000*thoud))/100;
				int ten = (i-(1000*thoud)-(100*hund))/10;
				int one = i-(1000*thoud)-(100*hund)-(10*ten);
				if((hund-ten) == (ten-one)&&(thoud-hund) == (hund-ten) ) {
					count++;
				}
			}
		}
		
		return count;
	}
	
}