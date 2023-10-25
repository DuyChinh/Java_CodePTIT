/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codePtit;

/**
 *
 * @author DuyChinhPro
 */
import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;
class Employee {
    int id;
    String name, gender, dob, address, tax, date;

    public Employee(int id, String name, String gender, String dob, String address, String tax, String date) {
        this.id = id;
        this.name = standardName(name);
        this.gender = gender;
        this.dob = dob;
        this.address = address;
        this.tax = tax;
        this.date = date;

//        standardBirth();
    }
    
    public String standardString(String s) {
        return Character.toUpperCase(s.charAt(0))+s.substring(1).toLowerCase();
    }
    
    public String standardName(String s) {
        String[] arr = s.split("\\s+");
        String res = "";
        for(String x : arr) {
            res+=standardString(x) + " ";
        }
        return res.substring(0, res.length()-1);
    }
    
    public void standardBirth() {
        StringBuilder sb = new StringBuilder(this.dob);
        if(sb.charAt(1) == '/') {
            sb.insert(0, '0');
        }
        if(sb.charAt(4) == '/') {
            sb.insert(4, '0');
        }
        this.dob = sb.toString();
    }
   
    @Override
    public String toString() {
//        standardName();
//        standardBirth();
        return String.format("%05d", id) + " " + 
                this.name + " " + this.gender + " " + 
                this.dob + " " + this.address + " " + this.tax + " " + 
                this.date;
    }
    
    
}
public class J05007_Sap_Xep_Danh_Sach_Doi_Tuong_Nhan_Vien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Employee> arr = new ArrayList<>();
        for(int i = 0; i < t; i++) {
            arr.add(new Employee(i+1, sc.nextLine(), sc.nextLine(),
                    sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(arr, new Comparator<Employee>() {
            public int compare(Employee x, Employee y) {
                int day1 = Integer.parseInt(x.dob.substring(0, 2));
                int day2 = Integer.parseInt(y.dob.substring(0, 2));
                int month1 = Integer.parseInt(x.dob.substring(3, 5));
                int month2 = Integer.parseInt(y.dob.substring(3, 5));
                int year1 = Integer.parseInt(x.dob.substring(6));
                int year2 = Integer.parseInt(y.dob.substring(6));
                if(year1 > year2) {
                    return 1;
                } 
                if(year1 == year2 && month1 > month2) {
                    return 1;
                }
                if(month1 == month2 && day1 > day2) {
                    return 1;
                }
          
                return -1;
            }
        });
        
        for(Employee x : arr) {
            System.out.println(x.toString());
        }
    }
}
//3
//Nguyen Van A
//Nam
//22/10/1982
//Mo Lao-Ha Dong-Ha Noi
//8333012345
//31/12/2013
//Ly Thi B
//Nu
//15/10/1982
//Mo Lao-Ha Dong-Ha Noi
//8333012346
//22/08/2011
//Hoang Thi C
//Nu
//04/02/1982
//Mo Lao-Ha Dong-Ha Noi
//8333012347
//22/08/2011