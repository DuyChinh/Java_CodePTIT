package Codeptit;

import java.util.*;

public class J08020_Kiem_Tra_Day_Ngoac_dung {
	public static boolean check(String s) {
		Stack<Character> st = new Stack<>();
		int i = 0;
		while(i < s.length()) {
			if(!st.empty()) {
				char x = st.peek();
				if(x == '(' && s.charAt(i) == ')' || x == '{' && s.charAt(i) == '}' || x == '[' && s.charAt(i) == ']') {
					st.pop();
				} else {
					st.push(s.charAt(i));
				}
			} else {
				st.push(s.charAt(i));
			}
			i++;
		}
		if(st.empty()) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = Integer.parseInt(sc.nextLine());
		while(t-->0) {
			String s = sc.nextLine();
			if(check(s)) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}
}