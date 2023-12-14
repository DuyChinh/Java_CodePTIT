package Codeptit;
import java.io.*;
import java.util.*;

public class J07040_LietKeTheoThuTuXuatHien {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream ob = new ObjectInputStream(new FileInputStream("NHIPHAN.in"));
		ArrayList<String> arr = new ArrayList<>();
		TreeSet<String> se = new TreeSet<>();
		arr =(ArrayList<String>)ob.readObject();
		
		
		for(String s: arr) {
			String[] a = s.trim().toLowerCase().split("\\s+");
			for(String s1: a) {
				se.add(s1);
			}
		}
		
		File file = new File("VANBAN.in");
		Scanner sc = new Scanner(file);
		while(sc.hasNextLine()) {
			String s = sc.next().toLowerCase();
			if(se.contains(s)) {
				System.out.println(s);
				se.remove(s);
			}
		}
	}
}
