package Codeptit;
import java.util.*;
import java.io.*;

class Subject implements Comparable<Subject> {
	private String id, subject, regit;
	public Subject(String id, String subject, String regit) {
		this.id = id;
		this.subject = subject;
		this.regit = regit;
	}
	
	@Override 
	public int compareTo(Subject sub) {
		return this.subject.compareTo(sub.subject);
	}
	
	@Override
	public String toString() {
		return this.id + " " + this.subject + " " + this.regit;
	}
}

public class J07034_List_Object {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("C:\\Users\\DuyChinhPro\\eclipse-workspace\\CodePTIT\\src\\Codeptit\\Data.txt"));
		int n = Integer.parseInt(sc.nextLine());
		ArrayList<Subject> arr = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			Subject sub = new Subject(sc.nextLine(), sc.nextLine(), sc.nextLine());
			arr.add(sub);
		}
		Collections.sort(arr);
		for(Subject x : arr) {
			System.out.println(x);
		}
	}
}
