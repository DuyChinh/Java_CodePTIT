package Codeptit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Pupil implements Comparable<Pupil> {
	private String name;
	private int ac, test;
	
	public Pupil(String name, int ac, int test) {
		this.name = name;
		this.ac = ac;
		this.test = test;
	}
	
	@Override
	public int compareTo(Pupil other) {
		if(this.ac < other.ac) {
			return 1;
		}
		if(this.ac == other.ac && this.test > other.test) {
			return 1;
		}
		if(this.ac == other.ac && this.test == other.test) {
			return this.name.compareTo(other.name);
		}
		return -1;
	}
	
	@Override
	public String toString() {
		return this.name +  " " + this.ac + " " + this.test;
	}
}

public class J05042_BXH {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		ArrayList<Pupil> arr = new ArrayList<>();
		while(n-->0) {
			arr.add(new Pupil(sc.nextLine(), sc.nextInt(), sc.nextInt()));
			sc.nextLine();
		}
		Collections.sort(arr);
		for(Pupil p: arr) {
			System.out.println(p);
		}
	}
}
