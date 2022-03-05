package seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class three {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n =Integer.parseInt(in.readLine());
		int[] []canva=new int [n][n];
		for(int i=0;i<n;i++)
		{
			String a=br.readLine();
			for(int j=0;j<n;j++)
			{
				
				StringTokenizer st=new StringTokenizer(in.readLine());
			    canva[i][j]=Integer.parseInt(st.nextToken());
			}
			
		}
		System.out.print(canva);

	}

}
