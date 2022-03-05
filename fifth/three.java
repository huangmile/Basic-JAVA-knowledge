package fifth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class three {

	public static void main(String[] args) throws IOException {
		 BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		 StringTokenizer st=new StringTokenizer(in.readLine());
		 int n=Integer.parseInt(st.nextToken());
		 int k=Integer.parseInt(st.nextToken());
		 int v=Integer.parseInt(st.nextToken());
		 String s[]=new String[n*k];
	     for(int jj=0;jj<k;jj++)
		 {
			 for(int i=0;i<n;i++)
			 {
				 for(int ii=0;ii<k;ii++)
				 {
					 System.out.println(s.charAt(i));
				 }
			 }
		 }
		 
	}
	for(int i=0; i<r; i++) {  // 原始每一行
		String s = in.readLine();
		for(int ii = 0; ii<k; ii++) {
			for(int j = 0; j<c; j++) {  // 原始每一列
				for(int jj=0; jj<k; jj++) {
					System.out.print(s.charAt(j));
				}
			}
			System.out.println();
		}
	}


}
