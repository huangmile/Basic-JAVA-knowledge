package sixth;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class three {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new FileReader("taming.in"));
		PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("taming.out")));

		int n = Integer.parseInt(br.readLine());
		int[] a = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(st.nextToken());
		}

		if (a[0] > 0) {
			pw.println(-1);
			pw.close();
			return;
		}

		a[0] = 0;
		int predict = -1;
		for (int i = n - 1; i >= 0; i--) {
			// TODO
		}
		
		int min = 0, max = 0;
		for(int i=0; i<n; i++) {
			if(a[i] == 0) {
				min++;
				max++;
			}
			
			if(a[i] == -1) {
				max++; 
			}
		} 
