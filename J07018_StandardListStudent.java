package Codeptit;
import java.util.*;
import java.io.*;

class Student3 {
	private String name, group, date;
	private double gpa;
	private int id;
	
	
	public Student3(int id, String name, String group, String date, double gpa) {
		this.id = id;
		this.name = standardName(name);
		this.group = group;
		this.date = standardBirth(date);
		this.gpa = gpa;
	}
	
	public String standardBirth(String date) {
		StringBuilder sb = new StringBuilder(date);
		if(sb.charAt(1) == '/') {
			sb.insert(0, "0");
		}
		if(sb.charAt(4) == '/') {
			sb.insert(3, "0");
		}
		return sb.toString();
	}
	
	public String standardName(String s) {
		String[] arr = s.trim().split("\\s+");
		String res = "";
		for(String x: arr) {
			x = Character.toUpperCase(x.charAt(0)) + x.substring(1).toLowerCase();
			res+=x+" ";
		}
		return res.trim();
	}
 

	@Override
	public String toString() {
		return "B20DCCN" + String.format("%03d", id) + " " + this.name + " " + this.group + " " + this.date + " " + String.format("%.2f", this.gpa);
	}
	
	
}

public class J07018_StandardListStudent {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("C:\\Users\\DuyChinhPro\\eclipse-workspace\\CodePTIT\\src\\Codeptit\\Data.txt"));
		int n = Integer.parseInt(sc.nextLine());
		for(int i = 0; i < n; i++) {
			Student3 st = new Student3(i+1, sc.nextLine(), sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()));
			System.out.println(st);
		}
	}
}
