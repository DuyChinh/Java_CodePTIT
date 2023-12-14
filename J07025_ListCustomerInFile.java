package Codeptit;
import java.util.*;
import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
class Customer implements Comparable<Customer>  {
	private String name, sex, dob, address;
	private int id;
	public Customer( int id, String name, String sex, String dob, String address) {
		this.id = id;
		this.name = standardName(name);
		this.sex = sex;
		this.dob = standardBirth(dob);
		this.address = address;
	}
	
	private String standardName(String s) {
		String[] arr = s.trim().split("\\s+");
		String res = "";
		for(String x : arr) {
			x = Character.toUpperCase(x.charAt(0))+ x.substring(1).toLowerCase();
			res+=x+" ";
		}
		return res.trim();
	}
	
	public String standardBirth(String s) {
		StringBuilder sb = new StringBuilder(s);
		if(sb.charAt(1) == '/') {
			sb.insert(0, "0");
		} 
		if(sb.charAt(4) == '/') {
			sb.insert(3, "0");
		}
		return sb.toString();
	}
	
	private String getBirth(String dob) {
		String[] arr = dob.split("/");
		return arr[2] + arr[1] + arr[0];
	}
	
	
	@Override
	public int compareTo(Customer cus) {
//		LocalDate thisDate = parseDate(this.dob);
//		LocalDate otherDate = parseDate(cus.dob);
		return getBirth(this.dob).compareTo(getBirth(cus.dob));
	}
	@Override
	public String toString() {
		return "KH"+ String.format("%03d", id)+" "+this.name + " " + this.sex + " " + this.address + " " + this.dob;
	}
	
}

public class J07025_ListCustomerInFile {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("C:\\Users\\DuyChinhPro\\eclipse-workspace\\CodePTIT\\src\\Codeptit\\Data.txt"));
		int t = Integer.parseInt(sc.nextLine());
		ArrayList<Customer> arr = new ArrayList<>();
		for(int i = 0; i < t; i++) {
			Customer cus = new Customer(i+1, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
			arr.add(cus);
		}
		Collections.sort(arr);
		for(Customer cus: arr) {
			System.out.println(cus);
		}
	}
}
