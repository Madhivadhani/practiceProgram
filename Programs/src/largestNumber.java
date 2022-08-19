import java.util.Scanner;

public class largestNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int a[] = new int[n];
		int large=0,index=0;
		int count=0;
		for(int i=0;i<n;i++) {
			a[i]= sc.nextInt();
		}
		
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(a[i]<a[j] && a[j]>large) {
					large=a[j];
					index=j;
				}
			}
		}
		for(int i=0;i<n;i++) {
		if(a[i]*2 >large && i!=index) {
			count++;
		}
		}
		
		if(count>0) {
			System.out.println(-1);
		}
		else {
			System.out.println(index);
		}
		

	}

}
