import java.util.Scanner;

public class PatternNumber {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int start=0;
		int space =n;
		for(int i=0;i<n;i++) {
			for(int j=space;j>0;j--) {
				System.out.print(" ");
			}
			
				for(int j=i;j>0;j--) {
					System.out.print(j);
				}
				for(int j=0; j<=i;j++) {
					System.out.print(j);
				}
				System.out.println();
				space -=1;
			
		}

	}
}


