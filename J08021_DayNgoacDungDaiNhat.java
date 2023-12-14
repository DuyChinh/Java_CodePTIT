package Codeptit;

import java.util.*;

public class J08021_DayNgoacDungDaiNhat {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
	
		
		while(n--> 0) {
			String s = sc.nextLine();
			Stack<Integer> st = new Stack<>();
			st.push(-1);
			int maxN = -1;
			for(int i = 0; i < s.length(); i++) {
				if(s.charAt(i) == '(') {
					st.push(i);
					
				} else {
					st.pop();
					if(st.size() > 0) {
						maxN = Math.max(maxN, i - st.peek());
					}
					if(st.size() == 0) {
						st.push(i);
					}
				}
			}
			System.out.println(maxN);
		}
	}
}
