package Codeptit;
import java.util.*;

public class J08012_Star {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Map<Integer, Integer> mp = new HashMap<>();
		int cnt[] = new int[n+1];
		while(n-->1) {
			int x = sc.nextInt(), y = sc.nextInt();
			cnt[x]++;
			cnt[y]++;
		}
		for(int i = 1; i <= n; i++) {
			if(cnt[i]!=1 && cnt[i] != n-1) {
				System.out.println("No");
				return;
			}
		}
		System.out.println("Yes");
	}
}
