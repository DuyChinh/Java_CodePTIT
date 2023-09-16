package EXE;
import java.util.*;
import java.util.Scanner;



public class EXE1 {
	public static boolean isPrime(int n) {
		if(n < 2) {
			return false;
		}
		for(int i = 2; i <= Math.sqrt(n); i++ ) {
			if(n % i == 0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int cnt = 1;
		while(t-->0) {
			
			int n = sc.nextInt();
			int m = sc.nextInt();
			int[][] arr = new int[n][m];
			for(int i = 0; i < n; i++) {
				for(int j = 0; j < m; j++) {
					arr[i][j] = sc.nextInt();
				}
			}
			System.out.println("Test "+ cnt++ + ":");
			boolean check = true;
			for(int i = 0; i < n; i++) {
				check = true;
				for(int j = 0; j < m; j++) {
					if(!isPrime(arr[i][j]) ) {
						check = false;
						break;
					}
				}
				if(check) {
					System.out.print(i + " ");
				}
			}
			System.out.println();
		}
	}
}
