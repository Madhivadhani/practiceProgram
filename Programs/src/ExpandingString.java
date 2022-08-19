import java.util.Scanner;

public class ExpandingString {
 public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String s = sc.nextLine();
	int len = s.length();
	 char[] a = new char[100];
	 int num =0;
	for(int i=0;i<len;i++) {
		a[i] = s.charAt(i);
	}

	for(int i=0;i<a.length;i++) {
		if(a[i]>='0'&& a[i]<='9') {
			char temp = a[i-1];
			
			while(a[i]>='0'&& a[i]<='9') {
				num = (num*10) + (a[i]-48);
				i++;
			}
			for(int j=0;j<num;j++) {
				System.out.print(temp);
			}
		}
		num =0;
	}
	
	
		
	}
	
}

