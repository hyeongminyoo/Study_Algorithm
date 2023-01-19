import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String [] abc = br.readLine().split(" ");
        int a = Integer.parseInt(abc[0]);
        int b = Integer.parseInt(abc[1]);
        int c = Integer.parseInt(abc[2]);
        
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write( ((a+b)%c) + "\n" );
        bw.write( (((a%c)+(b%c))%c) + "\n");
        bw.write(((a*b)%c) + "\n");
        bw.write( (((a%c)*(b%c))%c) + "\n");
        bw.flush();
        bw.close();
        
    }
}
