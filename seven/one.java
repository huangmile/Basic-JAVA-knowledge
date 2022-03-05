package seven;

import java.util.*;
import java.io.*;
public class one {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(in.readLine());
		int k=Integer.parseInt(st.nextToken());
		int n=Integer.parseInt(st.nextToken());
		for(int i=0;i<n;i++)
		{
			int x =Integer.parseInt(in.readLine());
			int t=0;
			long speed=x;
			int dis=k;
			while(dis>0)
			{
				long len =(1+speed)*speed/2;
				if(len>=dis&&len-speed<dis) {
					t+=speed;
					break;
				}
				if(len<dis)
				{n
					dis-=speed;
					t++;
					speed++;
				}
				else {
					speed--;
				}
			}
			System.out.println(t);
		}
		
   }
}
