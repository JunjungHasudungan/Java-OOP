package class_object;

public class Main {
	String nama;
	int umur;
	String role;
	
	public static void main(String[] args) {
		
		// inisailisasi object
		Main main = new Main();
		main.nama = "Hasudungan";
		main.umur = 25;
		main.role = "Guru";
		
		System.out.println("Nama : \t" + main.nama);
		System.out.println("Umur : \t" + main.umur);
		System.out.println("Role : \t" + main.role);
	}

}
