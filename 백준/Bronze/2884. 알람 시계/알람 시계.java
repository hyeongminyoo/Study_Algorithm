import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		String [] str = br.readLine().split(" ");
		int hour = Integer.parseInt(str[0]);
		int minute = Integer.parseInt(str[1]);
		
		if((minute-45)<0) {
			if(hour-1 < 0) {
				hour = (hour-1)+24;
			}else {
				hour -= 1;
			}
			minute = (minute-45)+60;
		}else {
			minute -= 45;
		}
		
		System.out.println(hour +" "+ minute);
		
		
	}
}