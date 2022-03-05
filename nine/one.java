package nine;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class one {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new FileReader("mowing.in"));
		PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("mowing.out")));

		int[][] lastTime = new int[2001][2001];
		for(int i = 0; i < lastTime.length; i++) {
			for(int j = 0; j < lastTime[i].length; j++) {
				lastTime[i][j] = -1;
			}
		}

		int currX = 1000;
		int currY = 1000;
		lastTime[currX][currY] = 0;
		int currentTime = 0;

		int steps,answer = Integer.MAX_VALUE;
		int n = Integer.parseInt(in.readLine());
		
		for(int i = 0; i < n; i++) {
			for(int i = 0; i < n; i++) {
				StringTokenizer st = new StringTokenizer(in.readLine());
				String direction = st.nextToken();
				int dirX = 0;
				int dirY = 0;
				if(direction.equals("N")) {
					dirX = -1;
				}
				else if(direction.equals("S")) {
					dirX = 1;
				}
				else if(direction.equals("W")) {
					dirY = -1;
				}
				else {
					dirY = 1;
				}
				int steps = Integer.parseInt(st.nextToken());
				for(int j = 1; j <= steps; j++) {
					currX += dirX;
					currY += dirY;
					currentTime++;
					if(lastTime[currX][currY] >= 0) {
						answer = Math.min(answer, currentTime - lastTime[currX][currY]);
					}
					lastTime[currX][currY] = currentTime;
				}
			}

		}

		if(answer == Integer.MAX_VALUE) {
			answer = -1;
		}
		pw.println(answer);
		
		in.close();
		pw.close();
	}
}

