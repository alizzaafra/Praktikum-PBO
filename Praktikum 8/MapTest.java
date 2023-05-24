/**
 * File : MapTest.java
 * Penulis : Alizza Afra Afifah / 24060121140135
 * Deskripsi : program yang menggunakan Gneric untuk pasangan kunci-nilai
**/

import java.util.*;

public class MapTest{
	public static void main(String[] args){
		//kunci -> integer, nilai -> string
		Map<Integer,String> map = new HashMap<Integer,String>();
		//menempatkan elemen kunci dan nilai
		map.put(1, "satu");
		map.put(2, "dua");
		//mengambil elemen pertama
		System.out.println(map.get(1));
		//mengambil keseluruhan kunci sebagai objek collection set
		Set<Integer> key = map.keySet();
		//bagaimana iterasi untuk mengambil keseluruhan
		//nilai dari kunci?
		//menggunakan iterasi seperti program ArrayListTest
		for (Integer i: key) {
            System.out.println(map.get(i));
		}
	}
}
