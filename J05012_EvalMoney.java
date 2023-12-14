package Codeptit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Money implements Comparable<Money> {
	private long num;
	private long price, discount;
	private String name, id;
	public Money(String id, String name, long num, long price, long discount) {
		this.id = id;
		this.name = name;
		this.num = num;
		this.price = price;
		this.discount = discount;
	}
	
	public long getTotal() {
		return this.price*this.num - this.discount;
	}
	
	@Override
	public int compareTo(Money other) {
		if(this.getTotal() < other.getTotal()) {
			return 1;
		}
		return -1;
	}

	@Override
	public String toString() {
		return this.id + " " + this.name + " " + this.num + " " + this.price + " " + this.discount + " " + this.getTotal();
	}
	
	
	
}

public class J05012_EvalMoney {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Money> arr = new ArrayList<>();
		int n = Integer.parseInt(sc.nextLine());
		for(long i = 0; i < n; i++) {
			arr.add(new Money(sc.nextLine(), sc.nextLine(), Long.parseLong(sc.nextLine()), Long.parseLong(sc.nextLine()), Long.parseLong(sc.nextLine())));
		}
		Collections.sort(arr);
		for(Money m: arr) {
			System.out.println(m);
		}
	}
}


//3
//ML01
//May lanh SANYO
//12
//4000000
//2400000
//ML02
//May lanh HITACHI
//4
//2550000000
//0
//ML03
//May lanh NATIONAL
//5
//3000000
//150000
