package pewarisan;

public class Babeh 
{
//	data member / attributes / properthies
	public  String nama;
	public String status;
	public int umur;
	static int index;
	
	public Babeh(String nama, String status, int umur)
	{
		this.nama = nama;
		this.status = status;
		this.umur = umur;
		this.index = 1;
	}
	
	public String getNama()
	{
		return this.nama;
	}
	
	public String getStatus()
	{
		return this.status;
	}
	
	public int getUmur()
	{
		return this.umur;
	}
	
	public void info()
	{
		System.out.println("No." + this.index++);
		System.out.println("Nama \t : " + this.getNama());
		System.out.println("Status \t : " + this.getStatus());
		System.out.println("Umur \t : " + this.getUmur());

	}
}
