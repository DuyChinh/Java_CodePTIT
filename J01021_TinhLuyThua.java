package Codeptit;

import java.util.Scanner;

public class J01021_TinhLuyThua {
	public static final long mod=(long)1e9+7;
	public static long solve(long a, long b) {
		long res = 1;
		while(b > 0) {
			if(b % 2 != 0) {
				res*=a;
				res%=mod;
			}
			a = (a%mod)*(a%mod);
			a%=mod;
			b/=2;
		}
		return res;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			long x = sc.nextLong();
			long y = sc.nextLong();
			if(x == 0 && y == 0) {
				break;
			}
			System.out.println(solve(x, y));
		}
	}
}
