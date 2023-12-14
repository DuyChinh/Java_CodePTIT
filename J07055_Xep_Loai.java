package Codeptit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.io.*;
class Student2 implements Comparable<Student2>{
	private int id;
	private String name;
	private double point1, point2, point3;
	
	
	public Student2(int id,String name, double point1, double point2, double point3) {
		this.id = id;
		this.name = standardName(name);
		this.point1 = point1;
		this.point2 = point2;
		this.point3 = point3;
	}

	private String standardName(String s) {
		String[] arr = s.trim().split("\\s+");
		String res ="";
		for(String x : arr) {
			x = Character.toUpperCase(x.charAt(0)) + x.substring(1).toLowerCase();
			res+=x+" ";
		}
		return res.trim();
	}
	
	private double getPoint() {
		return this.point1*0.25+ this.point2*0.35+this.point3*0.4;
	}
	
	private String getType() {
		double point = this.getPoint();
		if(point >= 8) {
			return "GIOI";
		} else if(point >= 6.5 && point < 8) {
			return "KHA";
		} else if(point >= 5 && point < 6.5) {
			return "TRUNG BINH";
		} 
		return "KEM";
	}

	@Override
	public int compareTo(Student2 st) {
		if(this.getPoint() < st.getPoint()) {
			return 1;
		}
		return -1;
	}
	
	@Override
	public String toString() {
		return "SV" + String.format("%02d", id) + " " + this.name + " " + String.format("%.2f", this.getPoint()) + " " + this.getType();
	}
	
}

public class J07055_Xep_Loai {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("C:\\Users\\DuyChinhPro\\eclipse-workspace\\CodePTIT\\src\\Codeptit\\Data.txt"));
		int n = Integer.parseInt(sc.nextLine());
		ArrayList<Student2> arr = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			Student2 st = new Student2(i+1, sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()));
			arr.add(st);
		}
		Collections.sort(arr);
		for(Student2 st : arr) {
			System.out.println(st);
		}
	}
}
