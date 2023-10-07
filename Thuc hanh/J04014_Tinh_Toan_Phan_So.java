/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codePtit;

/**
 *
 * @author DuyChinhPro
 */
import java.util.*;
class Fraction {
    private long num;
    private long deno;
    Fraction() {
    }
    Fraction(long num, long deno) {
        this.num = num;
        this.deno = deno;
    }
    
    public long gcd(long a, long b) {
        if(b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
    
    public Fraction simplify(Fraction f) {
        long gcd = gcd(f.num, f.deno);
        f.num /= gcd;
        f.deno /= gcd;
        return f;
    }
    
    public Fraction sum(Fraction f2) {
        Fraction f = new Fraction();
        f.num = this.num*f2.deno + f2.num*this.deno;
        f.deno = this.deno * f2.deno;
        return simplify(f);
    }
    
    public Fraction multiply() {
        Fraction f3 = new Fraction();
        f3.num = this.num * this.num;
        f3.deno = this.deno * this.deno;
        return simplify(f3);
    }
    
     public Fraction multiply1(Fraction f2) {
        Fraction f3 = new Fraction();
        f3.num = this.num * f2.num;
        f3.deno = this.deno * f2.deno;
        return simplify(f3);
    }
    

    
    @Override
    public String toString() {
        return this.num + "/" + this.deno + " ";
    }
}

public class J04014_Tinh_Toan_Phan_So {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0) {
            Fraction a = new Fraction(sc.nextLong(), sc.nextLong());
            Fraction b = new Fraction(sc.nextLong(), sc.nextLong());
            Fraction c = a.sum(b).multiply();
            Fraction d = a.multiply1(b).multiply1(c);
            System.out.print(c.toString());
            System.out.print(d.toString());
            System.out.println();
        }
        
    }
}