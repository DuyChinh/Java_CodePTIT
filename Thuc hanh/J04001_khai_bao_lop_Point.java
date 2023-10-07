package codePtit;

import java.util.Scanner;

/**
 * 
 */
class Point{
	private double x;
	private double y;
	
	Point(){};
	
	Point(double x, double y){
		this.x = x;
		this.y = y;	
	}
	//Alt + Shift + S


//	Point(Point p) {
//		p = new Point(this.x, this.y);
//	}
	
	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}
	
	public double distance(Point p) {
		double x = this.x - p.x;
		double y = this.y - p.y;
		return Math.sqrt((x*x) + (y*y));
	}
	
	public double distance(Point p1, Point p2) {
		double x = p1.x - p2.x;
		double y = p1.y - p2.y;
		return Math.sqrt((x*x) + (y*y));
	}

	@Override
	public String toString() {
		return "hello";
	}
	
}
public class J04001_khai_bao_lop_Point {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			Point p1 = new Point(sc.nextDouble(), sc.nextDouble());
			Point p2 = new Point(sc.nextDouble(), sc.nextDouble());
			System.out.printf("%.4f\n", p1.distance(p2));
//			System.out.println();
		}
	}

	
}
