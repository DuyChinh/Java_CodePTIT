package Codeptit;

import java.util.Scanner;

public class J03006_BeautifulNumber {
	public static boolean checkPali(String s) {
		int n = s.length();
		String s2 = "";
		for(int i = n-1; i >= 0; i--) {
			s2+=s.charAt(i);
		}
		if(s2.compareTo(s) == 0) {
			return true;
		}
		return false;
	}
	
	public static boolean checkString(String s) {
		int n = s.length();
//		System.out.println(s);
		for(int i = 0; i < n; i++) {
			int num = s.charAt(i) - '0';
			if(num % 2 != 0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = Integer.parseInt(sc.nextLine());
		while(t-->0) {
			String s = sc.nextLine();
			if(checkString(s) && checkPali(s)) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}
}
