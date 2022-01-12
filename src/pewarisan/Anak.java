package pewarisan;

public class Anak extends Babeh
{
	protected String role;
	
	public Anak(String nama, String status, int umur, String role)
	{
//		memanggil ulang constructor dari kelas Parent menggunakan keyword super()
		super(nama, status, umur);
		this.role = role;
	}
	
	
	public void infoSubClass()
	{
//		memanggil isi dalam method data meggunakan keyword super
		super.info();
		System.out.println("Role \t : " + this.role);
	}
}
