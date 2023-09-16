package EXE;
import java.util.*;
import java.util.Scanner;

public class EXE2 {
	public static int gcd(int a, int b) {
		while(b!=0) {
			int temp = b;
			b %=a;
			a = temp;
		}
		return a;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int[][] arr = new int[n][m];
			for(int i = 0; i < n; i++) {
				for(int j = 0; j < m; j++) {
					arr[i][j] = sc.nextInt();
				}
			}
			int gcdArr = 0;
			
			for(int i = 0; i < n; i++) {
				gcdArr = arr[i][0];
				for(int j = 1; j < m; j++) {
					gcdArr= gcd(gcdArr, arr[i][j]);
					System.out.print(gcdArr + " ");
				}
				System.out.print(gcdArr + " ");
			}
			System.out.println();
		}
	}
}
