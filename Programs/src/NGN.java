import java.util.Scanner;

public class NGN {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[100];
		int next;
		for(int i=0;i<n;i++) {
			a[i]= sc.nextInt();
			
		}
		System.out.println("Element"+"		"+"Value");
		for(int i=0;i<n;i++) {
			next=-1;
			for(int j=i+1;j<n;j++){
				if(a[i]<a[j]) {
					next=a[j];
					break;
				}
			}
			System.out.println(a[i]+"		"+next);
			
		}
		
	}

}
