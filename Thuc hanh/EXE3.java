package EXE;
import java.util.*;
public class EXE5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int cntTwo = 0, cntSix = 0;
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == '2') {
				cntTwo++;
			} 
			if(s.charAt(i) == '6') {
				cntSix++;
			}
		}
		int cnt = cntTwo + cntSix;
		if(cnt == 2 || cnt == 6) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}
