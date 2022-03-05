package fouth;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Test {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new FileReader("herding.in"));
		PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("herding.out")));
		int n=Integer.parseInt(in.readLine());
		ArrayList<Integer> list=new ArrayList();
		StringTokenizer st=new StringTokenizer(in.readLine());
		for(int i=0;i<n;i++)
		{
			list.add(Integer.parseInt(st.nextToken()));
		}
		
		boolean sorted=true;
		int counter=0;
		for(int i=0;i<n-1;i++)
		{
			for(int j=n-1;j>0;j--)
			{
				if(list.get(0)>list.get(j))
				{
					list.add(j+1,list.get(0));
					list.remove(0);
					sorted=false;
				}
				if(list.get(j)<list.get(j-1))
				{
					list.add(j,list.get(0));
					list.remove(0);
					sorted=false;
					
				}
			}
			if (sorted) {
				break;
			}
			else {
				counter++;
			}
			
		}
		pw.println(counter);
		in.close();
		pw.close();
		
		
		

	}

}
