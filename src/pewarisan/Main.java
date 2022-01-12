package pewarisan;

public class Main {

	public static void main(String[] args) {
		// inisialisasi class objek
		
		Babeh babeh = new Babeh("Asep", "Ayah", 45);
		Anak anak = new Anak("Aref", "Anak", 25, "Siswa");
		
		babeh.info();
		System.out.println();
		anak.infoSubClass();

	}

}
