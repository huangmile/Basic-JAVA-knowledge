package sencond;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;


public class one {

	public static void main(String[] args) throws IOException {
		cow[] cows=new cow[7];
		cows[0]= {"Bessie",0};
		BufferedReader in = new BufferedReader(new FileReader("mixmilk.in"));
		PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("mixmilk.out")));
		int n = Integer.parseInt(in.readLine());
		for(int i=0;i<n£»i++)
		{
			for(int j=0;j<7;j++)
			{
				if cow
			}
				
		}
		Student [] stu=new Student[n] ;
		for(int i=0;i<n;i++)
		{
		stu[i]=new Student( );
		StringTokenizer st= new StringTokenizer(br.readLine());
		stu[i] . id=Integer.parseInt(st. nextToken());
		stu[i] . name= st.nextToken();
		stu[i] . score=Integer.parseInt(st.nextToken());
		}
		Arrays.sort(stu,  new Comparator<Student>() {
			public int compare(Student o1, Student o2) {
				return o2.id-o1.id;
			}
		});

		for(int i=0;i<n;i++)
		{
			System.out.println(stu[i].id+" "+stu[i].name+" "+stu[i].score);


		}

	}
	static class cow
	{
		String name;
		String output;

	}
	}

}
