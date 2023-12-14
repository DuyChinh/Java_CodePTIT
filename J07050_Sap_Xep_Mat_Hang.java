package Codeptit;
import java.util.*;
import java.io.*;
import java.text.DecimalFormat;

class Product implements Comparable<Product>{
	private String name, type;
	private double buy, sell;
	private int id;
	
	public Product(int id, String name, String type, double buy, double sell) {
		this.id = id;
		this.name = name;
		this.type = type;
		this.buy = buy;
		this.sell = sell;
	}
	
	public double getProfit() {
		return this.sell - this.buy;
	}
	
	@Override
	public int compareTo(Product p) {
		if(this.getProfit() > p.getProfit()) {
			return -1;
		}
		return 1;
	}
	
	public String convertNumber(double num) {
		DecimalFormat de = new DecimalFormat("#, ##0.00");
		de.setGroupingUsed(false);
		return de.format(num);
	}
	
	@Override
	public String toString() {
		return "MH"+String.format("%02d", id)+" "+this.name + " " + this.type +  " " + convertNumber(this.getProfit());
	}
}

public class J07050_Sap_Xep_Mat_Hang {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("C:\\Users\\DuyChinhPro\\eclipse-workspace\\CodePTIT\\src\\Codeptit\\Data.txt"));
		int t = Integer.parseInt(sc.nextLine());
		ArrayList<Product> arr = new ArrayList<>();
		for(int i = 0; i < t; i++) {
			Product p = new Product(i+1,sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()),Double.parseDouble(sc.nextLine()) );
			arr.add(p);
		}
		Collections.sort(arr);
		for(Product p : arr) {
			System.out.println(p);
		}
	}
}
