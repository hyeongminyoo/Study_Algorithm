import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int count = 20;
		double sum_score = 0;
		double sum_hakjum = 0;
		for(int i=0; i<20; i++) {
			String [] str = br.readLine().split(" ");			
			double score = 0;
			double hakjum = Double.parseDouble(str[1]);
			switch (str[2]) {
			case "A+":
				score = 4.5;
				sum_score += score * hakjum;
				sum_hakjum += hakjum;
				continue;
			case "A0":	
				score = 4.0;
				sum_score += score * hakjum;
				sum_hakjum += hakjum;
				continue;
			case "B+":
				score = 3.5;
				sum_score += score * hakjum;
				sum_hakjum += hakjum;
				continue;
			case "B0":
				score = 3.0;
				sum_score += score * hakjum;
				sum_hakjum += hakjum;
				continue;
			case "C+":
				score = 2.5;
				sum_score += score * hakjum;
				sum_hakjum += hakjum;
				continue;
			case "C0":
				score = 2.0;
				sum_score += score * hakjum;
				sum_hakjum += hakjum;
				continue;
			case "D+":
				score = 1.5;
				sum_score += score * hakjum;
				sum_hakjum += hakjum;
				continue;
			case "D0":
				score = 1.0;
				sum_score += score * hakjum;
				sum_hakjum += hakjum;
				continue;
			case "F":
				score = 0.0;
				sum_score += score * hakjum;
				sum_hakjum += hakjum;
				continue;
			default:
				count--;
				continue;
			}
			
		}
		
		System.out.println(sum_score/sum_hakjum);
		
	}
	
}