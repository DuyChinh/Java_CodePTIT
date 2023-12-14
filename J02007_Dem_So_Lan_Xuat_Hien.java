package Codeptit;
//import java.util.Scanner;
//import java.util.HashMap;


import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class J02007_Dem_So_Lan_Xuat_Hien {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int cnt = 1;
		while(t-->0) {
			int n = sc.nextInt();
//			ArrayList<Integer> arr = new ArrayList<>();
			LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
			for(int i = 0; i < n; i++) {
				int x = sc.nextInt();
				if(map.containsKey(x)) {
					int frequence = map.get(x);
					map.put(x, frequence+1);
				} else {
					map.put(x, 1);
				}
			}
			System.out.println("Test " + cnt++ + ":");
			Set<Map.Entry<Integer, Integer>> entrySet = map.entrySet();
			
//			Set<Map.Entry<Integer, Integer>> entrySet = map.entrySet();
//			for(Map.Entry<Integer, Integer> entry: entrySet) {
//				System.out.println(entry.getKey() + " xuat hien " + entry.getValue()+" lan");
//			}
		}
	}
}
