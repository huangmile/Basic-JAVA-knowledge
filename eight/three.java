package eight;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

class test{
	int x,y;
	public  test(int x,int y) {
		this.x=x;
		this.y=y;
		
	}
}
public class three {

	public static void main(String[] args) {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n =Integer.parseInt(in.readLine());
		test[]num =new test[n];
		for(int i=0;i<n;i++)
		{
			StringTokenizer st=new StringTokenizer(in.readLine());
			int x=Integer.parseInt(st.nextToken());
			int y=Integer.parseInt(st.nextToken());
			num[i]=new test(x,y);
	
		}
		Arrays.sort(num,new Comparator<test>){
			@Override
			public int compare(test o1,test o2) {
				return o1.x-o1.x;
			}
			
		});

	}

}
