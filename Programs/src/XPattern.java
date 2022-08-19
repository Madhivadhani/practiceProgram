import java.util.Scanner;

public class XPattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s= sc.nextLine();
		int left = 0;
		int right = s.length()-1;
		boolean flag =false;
		
		for(int i=0;i<s.length();i++) {
			for(int j=0;j<left;j++) {
				System.out.print(" ");
			}
			
			System.out.print(s.charAt(left));
			for(int j=0;j<right-left;j++) {
				System.out.print(" ");
			}
			
			if(left!=right)
			System.out.println(s.charAt(right));
			
			
			
			if(left==right) {
			 System.out.println();
			 flag=true;
			}
			if(!flag) {
				left +=1;
				right-=1;
			}
			else {
				left -=1;
				right+=1;
			}
			
		}
		

	}

}
