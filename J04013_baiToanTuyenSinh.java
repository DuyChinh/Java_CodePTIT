package Codeptit;
import java.text.DecimalFormat;
import java.util.*;

class Student {
	private String id, name;
	private double math, physic, chemis;
	public Student(String id, String name, double math, double physic, double chemis) {
		this.id = id;
		this.name = name;
		this.math = math;
		this.physic = physic;
		this.chemis = chemis;
	}
	
	public double getPointPrior() {
		String s = this.id.substring(0, 3);
		if(s.compareTo("KV1") == 0) {
			return 0.5;
		} else if(s.compareTo("KV2") == 0) {
			return 1.0;
		} else {
			return 1.5;
		}
	}
	
	public String convertNum(double num) {
		DecimalFormat de;
		if(num == (int) num) {
			de = new DecimalFormat();
		} else {
			de = new DecimalFormat("#, #0.0");
		}
		return de.format(num);
	}
	
	public double getSum() {
		return this.math*2 + this.chemis + this.physic;
	}
	
	public String status() {
		if(getSum() + getPointPrior() < 24) {
			return "TRUOT";
		}
		return "TRUNG TUYEN";
	}
	
	@Override
	public String toString() {
		return this.id + " " + this.name + " " + convertNum(this.getPointPrior()) + " " + convertNum(this.getSum()) + " " + this.status();
	}
	
}

public class J04013_baiToanTuyenSinh {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student s = new Student(sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()));
		System.out.println(s);
	}
}
