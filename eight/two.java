package eight;

import java.util.*;
import java.io.*;
import java.sql.Array;


public class two {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new FileReader("paint.in"));
		PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("paint.out")));
		StringTokenizer st=new StringTokenizer(in.readLine());
		int n=Integer.parseInt(st.nextToken());
		int m=Integer.parseInt(st.nextToken());
		int []limit=new int[100];
		int []speed=new int[100];
		int start=0;
		for(int i=0;i<n;i++)
		{
			StringTokenizer sq=new StringTokenizer(in.readLine());
			int len=Integer.parseInt(sq.nextToken());
			int s=Integer.parseInt(sq.nextToken());
			for(int j=start;i<start+len;j++)
			{
				limit[j]=s;
			}
			start=start+len;
		}
		start=0;
		for(int i=0;i<m;i++)
		{
			StringTokenizer sq=new StringTokenizer(in.readLine());
			int len=Integer.parseInt(st.nextToken());
			int s=Integer.parseInt(st.nextToken());
			for(int j=start;i<start+len;j++)
			{
				speed[j]=s;
			}
			start=start+len;
		}
		int max=0;
		for(int i=0;i<100;i++)
		{
			max=Math.max(max, speed[i]-limit[i]);
		}
		pw.print(max);
		in.close();
		pw.close();

	}

}
