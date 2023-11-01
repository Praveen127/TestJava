package myjavaproj;

public class Pattern3 {

	public static void main(String[] args) {
		int c=1;
		int n=5;
		for(int row=0;row<n;row++) {
			
			for(int spc=1;spc<=n-(row+1);spc++) {
				System.out.print(" ");
			}
			for(int col=0;col<=row;col++) {
				if(col==0||row==0) {
					c=1;
				}else {
					c=c*(row-col+1)/col;
					
				}System.out.print(" "+c);
			}
			System.out.print("\n");
		}

	}

}
