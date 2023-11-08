package myjavaproj;

public class Testarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = new int[] {12,43,56,65,23};
		int arr2[] = new int[arr1.length];
		
		for(int i=0;i<arr1.length;i++) {
			arr2[i] = arr1[i];
			}
		for(int i=0;i<arr1.length;i++) {

			System.out.print(arr1[i]+" ");
		}
		
		for(int i=0;i<arr2.length;i++) {
			System.out.print(arr2[i]+" ");
		}
		

}
}