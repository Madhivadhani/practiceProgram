import java.util.Scanner;

public class HollowPrinting {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int outerspace = n/2;
		int innerspace=1;
		for( int i =0;i<n;i++) {
			
			for(int j =0;j<outerspace;j++) {
				System.out.print(" ");
				
			}
			if(i<n/2) {
				outerspace -= 1;
			}
			else {
				outerspace+=1;
			}
			
			if(i==0 || i==n-1) {
				System.out.print("*");
				System.out.println();
			}
			else {
				System.out.print("*");
				for(int j=0;j<innerspace;j++) {
					System.out.print(" ");
				}
				System.out.print("*");
				System.out.println();
				if(i<n/2) {
					innerspace += 2;
				}
				else {
					innerspace-=2;
				}
			}
			
		}
		

	}

}
