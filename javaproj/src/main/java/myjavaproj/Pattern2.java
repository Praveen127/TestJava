package myjavaproj;

public class Pattern2 {
	
	public static void main(String[] args) {
		int n=7;
		
		for(int row=1;row<=2*n-1;row++) {
			int totrow = row>n?row-n:n-row;
			for(int spc=1;spc<=totrow;spc++) {
				System.out.print(" ");
			}
			int r=n-1;
			int totrow1=row>n?2*r-1:2*row-1;
			for(int col=1;col<=totrow1;col++) {
				
				System.out.print("*");
				
			}
			System.out.println();
		}
	}

}
