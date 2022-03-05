package third;
import java.util.*;
import java.io.*;
public class one {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n =Integer.parseInt(in.readLine());
		int[]order=new int[n];
		StringTokenizer st=new StringTokenizer(in.readLine());
		for(int i=0;i<n;i++)
		{
			int target=Integer.parseInt(st.nextToken())-1;
			order[target] = i; // reverse
		}
		int[] ids = new int[n];
		st = new StringTokenizer(in.readLine());
		for(int i=0; i<n; i++) {
			ids[i] = Integer.parseInt(st.nextToken());
		}
		int[]temp=new int[n];
		for(int i=0; i<3; i++) {
			for(int j=0;j<n;j++)
			{
				temp[order[j]]=ids[j];
			}
			for(int j=0;j<n;j++)
			{
				ids[j]=temp[j];
			}
    	
		}
		for(int i=0;i<n;i++)
		{
			System.out.println(ids[i]);
		}


		
	}

}
