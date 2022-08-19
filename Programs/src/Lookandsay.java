import java.util.Scanner;

public class Lookandsay {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		System.out.println("1");
		String s = "1";
		int i=1;
		String new_str;
		while(i<n) {
			new_str ="";
			char a= s.charAt(0);
			int count=1;
			for(int j =1; j<s.length();j++) {
				if(s.charAt(j) != s.charAt(j-1)) {
					System.out.print(count + ""+a);
					new_str += ""+count+""+a;
					a=s.charAt(j);
				}
				else {
					count++;
					
				}
			}
				System.out.println(count + ""+a);
				new_str += ""+count+""+a;
				s= new_str;
				i++;
			}
			
		}

	}


