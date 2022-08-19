import java.util.Iterator;
import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = new int[100];
		int b[] = new int[100];
		int n = sc.nextInt();
		int temp;
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			if(a[i]==a[i+1] && a[i]!=0) {
				a[i]=a[i]+a[i+1];
				a[i+1]=0;
				i++;
			}
		
		}
		
		int count = 0;
		  for(int i=0;i<n;i++) {
			  if(a[i]!=0)
			  a[count++]=a[i];
			 
		  }
		  while (count < n)
	            a[count++] = 0;
			// pusharray(a, n);
			
		
		 for(int i=0;i<n;i++) {
			 
			 System.out.print(a[i]+" ");
		 }

	}
	/*public static void pusharray(int a[],int n) {
		  int count = 0;
		  for(int i=0;i<n;i++) {
			  if(a[i]!=0)
			  a[count++]=a[i];
			 
		  }
		  while (count < n)
	            a[count++] = 0;
	}*/

}
