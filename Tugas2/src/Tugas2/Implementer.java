package Tugas2;

public class Implementer implements Data {
	
		
	private int hasil;
	
	@Override
	public int penjumlahan(int angka1, int angka2) {
		hasil = angka1 + angka2;
		return hasil;
	}

	@Override
	public int pengurangan(int angka1, int angka2) throws Exception {
		// TODO Auto-generated method stub
		try {
			return angka1-angka2;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.getMessage();
			throw new Exception("error");
		}
	}
	
	@Override
	public int pembagian(int angka1, int angka2) {
		hasil = angka1 / angka2;
		return hasil;
	}

	@Override
	public int perkalian(int angka1, int angka2) {
		hasil = angka1 * angka2;
		return hasil;
		
	}
	
}
