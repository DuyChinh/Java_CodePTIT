package Codeptit;

import java.util.*;
import java.io.*;

public class NumberDistinct {
	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("C:\\Users\\DuyChinhPro\\eclipse-workspace\\CodePTIT\\src\\Codeptit\\Data.txt");
		Scanner sc = new Scanner(file);
		Map<Integer, Integer> mp = new TreeMap<>();
		while(sc.hasNext()) {
			String s1 = sc.next();
			try {
				int s = Integer.parseInt(s1);
				if(!mp.containsKey(s)) {
					mp.put(s, 1);
				} else {
					int fre = mp.get(s);
					mp.put(s, fre+1);
				}
			} catch(NumberFormatException e) {
				
			}
			
		}
		for(Map.Entry<Integer, Integer> map : mp.entrySet()) {
			System.out.println(map.getKey() + " " + map.getValue());
		}
	}
}
