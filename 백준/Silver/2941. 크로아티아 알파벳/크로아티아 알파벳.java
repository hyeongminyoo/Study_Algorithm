import java.io.*;


public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String [] str = br.readLine().split("");
		
		int count = str.length;
		
		String [] croa = new String[8];
		croa[0] = "c=";
		croa[1] = "c-";
		croa[2] = "dz=";
		croa[3] = "d-";
		croa[4] = "lj";
		croa[5] = "nj";
		croa[6] = "s=";
		croa[7] = "z=";
		
		for(int i=0; i<croa.length; i++) {
			
			if(i==2) {
				for(int j=2; j<str.length; j++) {
					if(croa[i].equals(str[j-2]+str[j-1]+str[j])) {
						str[j-2] = "";
						str[j-1] = "";
						str[j] = "";
						count -= 2;	
					}
				}
			}else {
				for(int j=1; j<str.length; j++) {
					if(croa[i].equals(str[j-1]+str[j])) {
						str[j-1] = "";
						str[j] = "";
						count -= 1;
					}
				}
			}
		}
		
		
		System.out.println(count);
	}
	
}