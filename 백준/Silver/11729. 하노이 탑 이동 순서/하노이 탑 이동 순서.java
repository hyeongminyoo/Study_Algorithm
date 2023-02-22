import java.io.*;
public class Main {
	
	private static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		sb.append((int)(Math.pow(2, n)-1)+"\n");
		
		hanoi(n, 1, 2, 3);
		
		System.out.println(sb);
				
	}
	
	/*
	 * n : 원판갯수
	 * start : 출발지
	 * mid : 옮기기 위해 이동해야할 장소
	 * to : 목적지
	 */
	
	
	public static void hanoi(int n, int start, int mid, int to) {
		
		// 이동할 원반의 수가 1개일 경우
		if(n == 1) {
			sb.append(start+" "+to+"\n");
			return;
		}
		
		
		// 1단계 : n-1 개의 원반을 3번쨰로 이동 (start 지점의 n-1개 원판을 mid지점으로 이동)
		hanoi(n-1, start, to, mid);
		
		
		// 2단계 : 1개를 A에서 C로 이동 (start 지점의 n번째 원판을 to 지점으로 이동)
		sb.append(start + " " + to + "\n");
		
		
		// 3단계 : n-1 개 원반을 B에서 C로 이동
		hanoi(n-1, mid, start, to);
		
	}
	
	
	
	
}