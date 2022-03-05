package third;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class two {

	public static void main(String[] args) throws NumberFormatException, IOException {
		int from[]=new int[1001];
		int to[]=new int[1001];
		int cnt[]=new int[1001];
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n =Integer.parseInt(in.readLine());
		for(int i=0;i<n;i++)
		{
			StringTokenizer st=new StringTokenizer(in.readLine());
			from[i]=Integer.parseInt(st.nextToken());
			to[i]=Integer.parseInt(st.nextToken());
			for(int j=from[i];j<to[i];j++)
			{
				cnt[j]++;
			}
		}
		int total=0;
		for(int i=0;i<1001;i++)
		{
			if(cnt[i]>0)
			{
				total++;
			}
		}
		int minAlone=Integer.MAX_VALUE;
		for(int i=0;i<n;i++)
		{
			int aloneInterval=0;
			for(int t=from[i];t<to[i];t++)
			{
				if(cnt[i]==1)
				{
					aloneInterval++;
				}
				minAlone=Math.min(minAlone, aloneInterval);
			}
		}

	}

}
