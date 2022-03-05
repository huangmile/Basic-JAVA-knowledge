package fifth;

import java.io.*;
import java.util.*;

public class two {

	public static void main(String[] args) throws NumberFormatException, IOException {
	    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	    int n =Integer.parseInt(in.readLine());
		int[] a=new int[n];
		int[] b=new int[n-1];
		StringTokenizer st=new StringTokenizer(in.readLine());
		for(int i=0;i<n-1;i++)
		{
			b[i]=Integer.parseInt(st.nextToken());
		}
		boolean c=true;
		for(int i=1;i<n;i++)
		{
			a[0]=1;
			for(int j=1;j<n;j++)
			{
				a[j]=b[j-1]-a[j-1];
				
			}
			int[] temp=Arrays.copyOf(a, n);
			Arrays.sort(a);
			boolean c1=true;
			for(int j=0;j<n;j++)
			{
				if(j+1!=a[j])
				{
					c1=false;
					break;
				}
			}
			if(c1)
			{
				for(int j=0;j<n-1;j++)
				{
					System.out.print(temp[j]+" ");
				}
				System.out.print(temp[n-1]);
				break;
			}
		}
		

	}

}
