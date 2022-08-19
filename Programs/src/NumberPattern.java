import java.util.Scanner;

public class NumberPattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x=1;
		int t,y;
		for(int i=n;i>=1;i--) {
			t=x;
			y=i;
			for(int k=1;k<=i;k++) {
				System.out.print("	");
			}
			for(int j=n;j>=i;j--) {
				System.out.print(t+"	");
				t= t-y;
				y++;
			}
			x=x+i;
			System.out.println();
		
		}
		
	}

}
