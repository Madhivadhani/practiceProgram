import java.util.Scanner;

public class Butterfly {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int element = n*2;
		int space=element-2;
		int dot= 1;
		for(int i =0;i<n;i++) {
			for(int j=0;j<dot;j++)
			System.out.print(".");
			for(int j=0;j<space;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<dot;j++)
				System.out.print("."  );
			
			System.out.println();
		space -=2;
		dot += 1;
		}
		
		dot = n;
		space=0;
		
		for(int i =0;i<n;i++) {
			for(int j=0;j<dot;j++)
			System.out.print(".");
			for(int j=0;j<space;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<dot;j++)
				System.out.print("."  );
			
			System.out.println();
		space +=2;
		dot -= 1;
			}
			
		}
		}
	

	


