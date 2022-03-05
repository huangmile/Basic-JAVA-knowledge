package sixth;

import java.util.*;
import java.io.*;

public class two {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n =Integer.parseInt(in.readLine());
		int pair[]=new int[n];
		int pair2[]=new int[n];
		for(int i=0;i<n;i++) {
			pair[i]=Integer.parseInt(in.readLine());
			pair2[i]=Integer.parseInt(in.readLine());
		}
		Arrays.sort(pair);
		int count=0;
		for(int i=0;i<n;i++) {
			if(pair[i]!=pair2[i])
			{
				count++;
			}
		}
		int ans=count-1;
		if(ans<0)
		{
			ans=0;
		}
		System.out.print(ans);
		
		

	}

}
