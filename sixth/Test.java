package sixth;
import java.util.*;
import java.io.*;

public class Test {
	
	static class Cow implements Comparable<Cow> {
		int day;
		String name;
		int change;
		public Cow(int day, String name, int change) {
			this.day = day;
			this.name = name;
			this.change = change;
		}
		@Override
		public int compareTo(Cow o) {
			return this.day - o.day;
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(in.readLine());
		Cow[] cows = new Cow[n];
		for(int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(in.readLine());
			int day = Integer.parseInt(st.nextToken());
			String name = st.nextToken();
			int change = Integer.parseInt(st.nextToken());
			cows[i] = new Cow(day, name, change);
 		}
		
		Arrays.sort(cows);
		
		int bessie = 7, elsie = 7, mildred = 7;
		// if several cows tie for the highest milk output, he displays all of their pictures
		boolean bOn = true, eOn = true, mOn = true;
		int count = 0;
        for(int i=0; i<n; i++) {
        	//  Bessie, Elsie, and Mildred
        	if("Bessie".equals(cows[i].name)) {
        		bessie += cows[i].change;
        	}
        	if("Elsie".equals(cows[i].name)) {
        		elsie += cows[i].change;
        	}
        	if("Mildred".equals(cows[i].name)) {
        		mildred += cows[i].change;
        	}
        	
        	// TODO
        	int max = Math.max(bessie,elsie);
        	max=Math.max(max,mildred);
        	boolean bOn2 = (max == bessie),eOn2 = (max == elsie),mOn2 = (max == mildred);
        	if((bOn2!=bOn||mOn2!=mOn||eOn2!=eOn))
        	{
        		count++;
        		bOn=bOn2;
        		eOn=eOn2;
        		mOn=mOn2;
        	}

        }
        System.out.print(count);
	}
}	