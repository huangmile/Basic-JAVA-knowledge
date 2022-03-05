package fifth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class one {
	 public static void main(String args[]) throws NumberFormatException, IOException {
		 BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			StringTokenizer st=new StringTokenizer(in.readLine());
			int n=Integer.parseInt(st.nextToken());
			int k=Integer.parseInt(st.nextToken());
			int linecnt=0;
			for(int i=0;i<n;i++) {
				String word=in.readLine();
				if(linecnt+word.length()>k)
				{
					System.out.print("");
					linecnt=0;
				}
				if(linecnt>0)
				{
					System.out.print(" ");
				}
				System.out.println(word);
				linecnt+=word.length();
				
				
			}
	 }
	 

}
