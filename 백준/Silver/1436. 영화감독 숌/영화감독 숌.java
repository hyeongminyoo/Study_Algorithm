import java.io.*;

public class Main {
	
	public static String [] str;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		if(n>1) {
			func(n);
		}else {
			System.out.println(666);
		}
		
		
		
		
	}
	
	public static void func(int n) {
		
		int prev_digit = 0;
		int count = 1;
		int num = 0;
		
		while(true) {
			if((prev_digit % 10000)/10 == 666 && prev_digit % 10 !=6) {
				for(int i=0; i<100; i++) {
					if(count == n) {
						System.out.println(prev_digit * 1000 + num);
						return;
					}
					
					num++;
					count++;
				}
				prev_digit++;
			
			}else if(prev_digit%1000 == 666) {
				num = 0;
				for(int i=0; i<1000; i++) {
					if(count ==n) {
						System.out.println(prev_digit*1000+num);
						return;
					}
					count++;
					num++;
				}
				prev_digit++;
			}else if(prev_digit % 100 == 66) {
				num = 600;
				for(int i = 0; i<100; i++) {
					if(count == n) {
						System.out.println(prev_digit*1000 + num);
						return;
					}
					count++;
					num++;
				}
				prev_digit++;
			}else if(prev_digit%10 == 6) {
				num = 660;
				for(int i=0; i<10; i++) {
					if(count == n) {
						System.out.println(prev_digit*1000+num);
						return;
					}
					num++;
					count++;
				}
				prev_digit++;
			}else {
				num = 666;
				if(count == n) {
					System.out.println(prev_digit*1000+num);
					return;
				}
				count++;
				prev_digit++;
			}
			
		}
		
	}
	
	
	
	
	
}