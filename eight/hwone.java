package eight;
import java.util.*;
import java.io.*;


public class hwone {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new FileReader("promote.in"));
		PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("promote.out")));
		int a[]=new int[5];
		int b[]=new int[5];
		for(int i=1;i<=4;i++)
		{
			StringTokenizer st=new StringTokenizer(in.readLine());
			a[i]=Integer.parseInt(st.nextToken());
			b[i]=Integer.parseInt(st.nextToken());
		}
		int ans[]=new int[4];
		for(int i=1;i<=4;i++)
		{
			if(b[i]-a[i]!=0)
			{
				if(i==4)
				{
					ans[1]+=b[i]-a[i];
					ans[2]+=b[i]-a[i];
					ans[3]+=b[i]-a[i];
				}
				if(i==3)
				{
					ans[1]+=b[i]-a[i];
					ans[2]+=b[i]-a[i];
				}
				if(i==2)
				{
					ans[1]+=b[i]-a[i];
				}
			}
		}
		for(int i=1;i<4;i++)
		{
			pw.println(ans[i]);

		}
		in.close();
		pw.close();

	}

}
