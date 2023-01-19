import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	int a = Integer.parseInt(br.readLine()); 
    	String [] str = br.readLine().split("");

    	int b3 = Integer.parseInt(str[0]);
    	int b2 = Integer.parseInt(str[1]);
    	int b1 = Integer.parseInt(str[2]);
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	bw.write((a*b1) + "\n");
    	bw.write(a*b2 + "\n");
    	bw.write(a*b3 + "\n");
    	bw.write(a*(100*b3+10*b2+b1)+"\n");
    	bw.flush();
    	bw.close();
    }
}
