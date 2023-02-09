import java.io.*;

public class Main {
	
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int [][] numbers = new int[9][9];
		int max = -1;
		int row = -1;
		int col = -1;
		
		for(int i=0; i<9; i++) {
			String [] str = br.readLine().split(" ");
			for(int j=0; j<str.length; j++) {
				numbers[i][j] = Integer.parseInt(str[j]);
				if(max < numbers[i][j]) {
					max = numbers[i][j];
					row = i;
					col = j;
				}
			}
		}
		
		System.out.println(max);
		System.out.println(row+1+" "+(col+1));
		
		
	}
	
	
	
}