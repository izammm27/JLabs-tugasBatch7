package Tugas2;

public class Runner {
	public static void main(String[] args) throws Exception {

		Implementer Kalkulator = new Implementer();
		
	    System.out.println(Kalkulator.penjumlahan(20, 5));	
		System.out.println(Kalkulator.pengurangan(20, 1));
		System.out.println(Kalkulator.perkalian(20, 5));
		System.out.println(Kalkulator.pembagian(20, 4));
	}
}
