package Codeptit;
import java.io.*;
import java.util.*;
public class NumberDistinct2 {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		DataInputStream data = new DataInputStream(new FileInputStream("DATA.IN"));
//		TreeMap<Integer, Integer> mp = new TreeMap<>();
//		for(int i = 0; i < 100000; i++) {
//			int n = data.readInt();
//			if(!mp.containsKey(n)) {
//				mp.put(n,1);
//			} else {
//				int fre = mp.get(n);
//				mp.put(n, fre+1);
//			}
//		}
//		for(Map.Entry<Integer, Integer>map: mp.entrySet()) {
//			System.out.println(map.getKey() + " " + map.getValue());;
//		}
		int[] cnt = new int[1001];
		for(int i = 0; i < 100000; i++) {
			cnt[data.readInt()]++;
		}
		for(int i = 0; i < 1000; i++) {
			if(cnt[i] > 0) {
				System.out.println(i + " " + cnt[i]);
			}
		}
	}
}
