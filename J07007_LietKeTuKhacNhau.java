package Codeptit;
import java.util.*;
import java.io.*;

class WordSet {
	private TreeSet<String> set = new TreeSet<>();
	public WordSet(String s) throws FileNotFoundException {
		Scanner sc = new Scanner(new File(s));
		while(sc.hasNextLine()) {
			set.add(sc.next().toLowerCase());
		}
	}
	
	@Override
	public String toString() {
		String res = "";
		for(String s: set) {
			res += s + "\n";
		}
		return res;
	}
}

public class J07007_LietKeTuKhacNhau {
	public static void main(String[] args) throws FileNotFoundException {
		WordSet ws = new WordSet("C:\\Users\\DuyChinhPro\\eclipse-workspace\\CodePTIT\\src\\Codeptit\\Data.txt");
        System.out.println(ws);
	}
}
