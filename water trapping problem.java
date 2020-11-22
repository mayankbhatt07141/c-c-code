package nptel;

import java.util.Scanner;
public class water_trapping_problem{
	public static void main(String[] args) {
		int i;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number of coloumns in the water tank");
		int n;
		n=scan.nextInt();
		int[] arr =new int[n];		
		for(i=0;i<n;i++){
			arr[i]=scan.nextInt();
		}
		int lmax=0,rmax=0,volume=0;
		for(i=1;i<n-1;i++) {
			lmax=arr[i];
			for(int j=i-1;j>=0;j--) {
				lmax=Math.max(lmax,arr[j]);	
			}
			rmax=arr[i];
			for(int j=i+1;j<n;j++) {
				rmax=Math.max(rmax,arr[j]);
			}
			volume+=Math.min(rmax,lmax)-arr[i];
			System.out.println(volume);
			
		}
		
		scan.close();
		System.out.println(volume);
	}
}
