package polimorphism;

public class Jajar_Genjang extends BangunDatar
{
	private float alas, tinggi, sisi;
	
	Jajar_Genjang(float alas, float tinggi)
	{
		this.alas = alas;
		this.tinggi = tinggi;
		this.sisi = 0;
	}
	
	@Override
	public float luas()
	{
		return this.alas * this.tinggi;
	}
}
