package sencond;
		import java.util.*;
		import java.io.*;
public class two {
			public static void main(String[] args) throws IOException {
				BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
				// BufferedReader in = new BufferedReader(new FileReader("Test.in"));
				// PrintWriter pw = new PrintWriter(new BufferedWriter(new
				// FileWriter("Test.out")));

				String s = in.readLine();
				char[] letters= s.toCharArray();
				
				int answer = 0;
				
				for(int i=0; i<26; i++) {
					char c = (char)(i + 'A');
					int beginIndex = -1;
					for(int j = 0; j < 52; j++) {
						if(c == letters[j]) {
							beginIndex = j;
							break;
						}
					}
					
					int[] count = new int[26];
					for(int j=beginIndex+1;j<52;j++)
					{
						count[s[j]-'A']++;
					}
					for(int j=0;j<26;j++)
					{
						if(count[j]==1)
						{
							answer++;
						}
					}
				}
				




	}

}
