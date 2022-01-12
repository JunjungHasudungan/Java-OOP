package constructor;

public class Main 
{
//	data member / attributes / properthies
	String nama;
	int umur;
	
//	constructor
	Main(String nama,int umur)
	{
//		nama = nama;
		this.nama = nama;
//		umur = umur;
		this.umur = umur;
	}
	
	public static void main(String[] args) 
	{
//		inisialisasi objek pada class
		Main main = new Main("Hasudungan", 25);
		
		System.out.println("Nama \t: " + main.nama);
		System.out.println("Umur \t: " + main.umur);

	}

}
