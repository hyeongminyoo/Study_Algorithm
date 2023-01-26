import java.io.*;


public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int c = Integer.parseInt(br.readLine());
		for(int i = 0; i<c; i++) {
			String [] str = br.readLine().split(" ");
			int [] scores = new int[str.length-1]; 
			int count = Integer.parseInt(str[0]);
			int sum = 0;
			for(int k=0; k<scores.length; k++) {
				scores[k] = Integer.parseInt(str[k+1]);
				sum += scores[k];
			}
			
			double avg = sum/count;
			double higher = 0;
			for(int k=0; k<scores.length; k++) {
				if(scores[k] > avg) {
					higher++;
				}
			}
			
			double result = higher/count*100;
			
			result = Math.round(result*1000)/1000.0;
			String resultS = String.format("%.3f", result);
			
			sb.append(resultS +"%\n" );
		}
		System.out.println(sb);
	}
}