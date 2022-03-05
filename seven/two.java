package seven;
import java.util.*;
import java.io.*;
public class two {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(in.readLine());
		int x=Integer.parseInt(st.nextToken());
		int y=Integer.parseInt(st.nextToken());
		int len =Math.abs(x-y);
		int step =1;
		int dis=0;
		while(true){
			if(x<y&&step>=len) {
				dis+=len;
				break;
			}
			if(x>y&&-step>=len) {
				dis+=len;
				break;
			}
			dis+=Math.abs(step)*2;
			step=step*(-2);
		}
		System.out.print(dis);
	}

}
