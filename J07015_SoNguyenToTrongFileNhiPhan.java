package Codeptit;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.*;


public class J07015_SoNguyenToTrongFileNhiPhan {
	public static boolean isPrime(int n) {
		if(n < 2) {
			return false;
		}
		for(int i = 2; i <= Math.sqrt(n); i++) {
			if(n % i == 0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream ob = new ObjectInputStream(new FileInputStream("SONGUYEN.in"));
		ArrayList<Integer> arr = (ArrayList<Integer>) ob.readObject();
		TreeMap<Integer, Integer> mp =  new TreeMap<>();
		for(int x : arr) {
			if(isPrime(x)) {
				if(!mp.containsKey(x)) {
					mp.put(x, 1);
				} else {
					int fre = mp.get(x);
					mp.put(x, fre+1);
				}
			}
		}
		for(Map.Entry<Integer, Integer> map: mp.entrySet()) {
			System.out.println(map.getKey() + " " + map.getValue());
		}
	}
}
