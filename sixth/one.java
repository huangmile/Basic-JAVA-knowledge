package sixth;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class one {

	public static void main(String[] args) {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n =Integer.parseInt(in.readLine());
		cow[]=cows=new cow[n];
		for(int i=0;i<n;i++) {
		StringTokenizer st=new StringTokenizer(in.readLine());
		num[i]=Integer.parseInt(st.nextToken());
		}
	}
	public cow(int day,string name,int change)
	{
		this.day=day;
		this.name=name;
		this.change=change;
		
	}

}
