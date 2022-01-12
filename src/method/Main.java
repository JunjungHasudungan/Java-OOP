package method;

public class Main {

//	data member / attributes / properthies 
	String nama;
	
//	constructor
	Main(String nama)
	{
		this.nama = nama;
	}
	
//	method dengan parameter tanpa nilai return
	void setNama(String nama)
	{
		this.nama = nama;
	}
	
//	method tanpa parameter dengan nilai return
	String getNama()
	{
		return this.nama;
	}
	
//	method dengan parameter dan dengan nilai kembali
	String perkenalan(String pesan)
	{
		return pesan + this.getNama();
	}
	
//	method tanpa parameter dan tanpa nilai return
	void display()
	{
		System.out.println(" === Tutorial menggunakan method ====");
	}
	
	public static void main(String[] args) {
//		inisialisasi class object
		Main main = new Main("Rendi");

//		memanggil method kosong
		main.display();
		System.out.println("Nama awal " + main.nama);
		
//		ubah nilai default pada constructor menggunakan method setter 
		main.setNama("Hasudungan");
		
//		panggil nilai yang sudah diubah
		System.out.println("Nama \t: " + main.getNama());
		
//		panggil method parametr dan dengan method menggembalikan nilai return
		System.out.println(main.perkenalan("Halo ") + ", apa kabar...");
		
	}
}
