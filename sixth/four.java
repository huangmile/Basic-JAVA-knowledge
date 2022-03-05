package sixth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class four {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int a[]=new int[12];
		int b[]=new int[12];
		for(int i=0;i<10;i++) {
		StringTokenizer st=new StringTokenizer(in.readLine());
		a[i]=Integer.parseInt(st.nextToken());
		}
		for(int i=0;i<10;i++) {
			StringTokenizer st=new StringTokenizer(in.readLine());
			b[i]=Integer.parseInt(st.nextToken());
		}
		int reading=1000;
		for(int i-0;i<10;i++)
		{
			reading-=a[i];
			b[10]=a[i];
			for(int j=0;j<11;j++)
			{
				reading+=b[i];
				a[10]=b[j];
				for(int k=0;k<11;k++)
				{
					if(i==k)
					{
						continue;
					}
					reading-=a[k];
					b[11]=a[k];
					for(int l=0;l<12;l++)
					{
						if(j==l)
						{
							continue;
						}
						reading+=b[i];
						a[11]=b[l];
						
					}
				}
			}
		}
	

	}

}
