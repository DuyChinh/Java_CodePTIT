package Codeptit;
import java.util.*;
import java.io.*;
public class J0722_RemoveInteger {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("DATA.in"));
		TreeSet<String> set = new TreeSet<>();
		while(sc.hasNextLine()) {
			String s = sc.next();
			
			try {
				int n = Integer.parseInt(s);
			} catch(Exception e) {
				set.add(s);
			}
			
		}
		String res="";
		for(String s: set) {
			res+=s+" ";
		}
		System.out.println(res.trim());
	}
}
