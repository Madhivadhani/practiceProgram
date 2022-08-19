import java.util.Scanner;

public class SubString {

	public static void main(String[] args) {
		char[] a = new char[100];
		char b[][] = new char[100][10];
		char c[] = new char[100];
		
		
		int d=0;
		boolean flag = true;
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int len = s.length();
		for(int i=0;i<len;i++) {
			a[i] = s.charAt(i);
		}
		String ss = sc.nextLine();
		int lent = ss.length();
		for(int i=0;i<lent;i++) {
			c[i] = s.charAt(i);
		}
		
		while(d*d <len) {
			d++;
		}
		int k=0;
		for(int i=0;i<d;i++) {
			
			for(int j=0;j<d;j++) {
				b[i][j]= a[k++];
			}
		}
			for(int i=0;i<d;i++) {
			
			for(int j=0;j<d;j++) {
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
			
			for(int i=0;i<d;i++) {
				
				for(int j=0;j<d;j++) {
					if(b[i][j]==c[k]);
					{
						flag=true;
						int count=0;
						for(;;k++) {
							count++;
							if(c[k]!=b[i][++j]) {
								flag=false;
								break;
							}
						}
						if(flag==true)
						System.out.println(i +", "+ j);
					}
					
					
						
				}
			}
			
				}
		
	}

