import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		String [] str = br.readLine().split(" ");
		int hour = Integer.parseInt(str[0]);
		int minute = Integer.parseInt(str[1]);
		
		int time = Integer.parseInt(br.readLine());		
		int hour_plus = time/60;
		int minute_plus = time%60;
		
		if((minute+minute_plus)>=60) {
			hour += 1;
			minute = (minute+minute_plus)-60;
			if((hour+hour_plus)>=24) {
				hour = hour+hour_plus - 24;
			}else {
				hour = hour+hour_plus;
			}			
		}else {
			minute = minute+minute_plus;
			if((hour+hour_plus)>=24) {
				hour = hour+hour_plus - 24;
			}else {
				hour = hour+hour_plus;
			}	
		}
		
		System.out.println(hour + " "+ minute);
		
	}
}
