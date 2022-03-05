
import java.util.*;
import java.io.*;
public class hwtwo {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("angry.in"));
		PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("angry.out")));
		int n = Integer.parseInt(br.readLine());
		int[] haybales = new int[n];
		for(int i = 0; i < n; i++) {
			haybales[i] = Integer.parseInt(br.readLine());
		}

		Arrays.sort(haybales);
		
		int answer = 1;
		
		for(int i= 0; i < n; i++) {
			int leftMostExplosion = getExplosionIndex(i, -1);
			int rightMostExplosion = getExplosionIndex(i, -1);
			int count = rightMostExplosion - leftMostExplosion + 1;
			answer=Math.max(answer, count);
		}
		pw.println(answer);
		pw.close();
	}


public static int getExplosionIndex(int startIndex,int step) {
	int lastIndex = startIndex;
	int radius = 1;
	while(lastIndex > 0 && lastIndex < n-1) {
		int nexIndex = lastIndex;
		while(true)
		{
			if(nextIndex+step>=0&&nextIndex+step<n&&
					abs(haybales[nextIndex+step]-haybales[lastIndex]<=radius){
				
			}
			else {
				break;
			}
		}
		if(nextIndex = lastIndex)
		{
			break;
		}
	
		lastIndex = nextIndex;
		radius++;
	}
	return lastIndex;
}

}