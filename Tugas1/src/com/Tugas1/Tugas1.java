package com.Tugas1;

import java.util.TreeMap;
import java.util.TreeSet;

public class Tugas1 {
	public static void main(String[] args) {
		

		// Bikin treeset
		
		System.out.println("==========TREESET==========");
		
		TreeSet<String> warna = new TreeSet<>();
		
		warna.add("Merah");
		warna.add("Hitam");
		warna.add("Biru");
		warna.add("Kuning");
		warna.add("Coklat");
		warna.add("Abu-abu");
		
		//cetak
		
		System.out.println("Jenis warna ");
		for (String item : warna) {
			System.out.println(item);
	}

        // Bikin treemap
		
		System.out.println("==========TREEMAP==========");
		
		
        TreeMap<Integer, String> umur = new TreeMap<>();
        
        umur.put(6, "Bayu");
        umur.put(7,"Andi");
        umur.put(2, "Rudi");
        umur.put(1, "Maul");
        umur.put(3, "Galang");
        umur.put(5, "Eko");
        umur.put(4, "Oji");

        System.out.println("Hasil Perlombaan Balap Karung");
        for (Integer angka : umur.keySet()) {
        	System.out.println(umur.get(angka) + " juara " + angka);
        }
        
}
}
