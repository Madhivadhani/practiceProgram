import java.util.Scanner;
import java.util.Stack;

public class BalanceBracket {

	public static void main(String[] args) {
		String expression;
	      
	      Scanner s = new Scanner(System.in);
	      
	      System.out.print("Enter the Expression: ");
	      expression = s.nextLine();
	      
	      
	      if(isBalance(expression)) {
	    	  System.out.println("Balanced");
	      }
	      else {
	    	  System.out.println("Unbalance");
	      }
	      
	}

	 static boolean isBalance(String expression) {
		Stack<Character> stk = new Stack<Character>();
		int length = expression.length();
		for(int i=0;i<length;i++) {
			char x = expression.charAt(i);
			
			if(x=='('|| x=='{'|| x=='{') {
				stk.push(x);
				continue;
			}
			
			if(stk.isEmpty()) {
				return false;
			}
			switch(x) {
			case ')': 
				if(stk.peek()!='(') {
					return false;
				}
				stk.pop();
				break;
			case '}':
				if(stk.peek()!='{') {
					return false;
				}
				stk.pop();
				break;
			case '[':
				if(stk.peek()!=']') {
					return false;
				}
				stk.pop();
				break;
			}
			
		}
		return (stk.isEmpty());
	}
	
		
	}

