import java.util.*;
import java.io.*;


public class one {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new FileReader("paint.in"));
		PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("paint.out")));
		StringTokenizer st=new StringTokenizer(in.readLine());
		int a=Integer.parseInt(st.nextToken());
		int b=Integer.parseInt(st.nextToken());
		StringTokenizer sq=new StringTokenizer(in.readLine());
		int c=Integer.parseInt(sq.nextToken());
		int d=Integer.parseInt(sq.nextToken());
		int ans=0;
		if(a<=c&&b<=d)
		{
			ans=d-a;
		}
		if(a>=c&&b<=d)
		{
			ans=d-c;
		}
		if(a>=c&&b>=d)
		{
			ans=b-c;
		}
		if(a<=c&&b>=d)
		{
			ans=b-a;
		}
		pw.println(ans);
		in.close();
		pw.close();
	}

}
