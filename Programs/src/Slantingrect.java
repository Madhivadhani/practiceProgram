import java.util.Scanner;

public class Slantingrect {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int outerspace = n-1;
		for(int i=0;i<n;i++) {
			for(int j =0; j<outerspace;j++) {
				System.out.print(" ");
			}
			for(int j =0;j<n;j++) {
				System.out.print("*");
			}
			System.out.println();
			outerspace -= 1;
		}

	}

}
