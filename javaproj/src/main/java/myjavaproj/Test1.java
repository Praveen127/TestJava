package myjavaproj;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter num");
		int n = s.nextInt();
		int sum = 0;
		for(int i=1;i<=n;i++) {
			System.out.println(i);	
			sum += i;
		}
	System.out.println(sum);
	System.out.println("Average is:"+ sum/n);	
	}

}
