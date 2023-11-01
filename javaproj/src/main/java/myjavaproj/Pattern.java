package myjavaproj;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		
		for(int row=1;row<2*n;row++) {
			int totspc = row>n?row-n:n-row;
			for(int spc=0;spc<totspc;spc++) {
				System.out.print(" ");
			}
			int totrow = row>n?2*n-row:row;
			for(int col=totrow;col>=1;col--) {
				
				System.out.print(col);
			}
			
			for(int col=2;col<=totrow;col++) {
				System.out.print
				(col);
			}
			System.out.println("");
		}
	}

}
