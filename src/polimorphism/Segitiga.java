package polimorphism;

public class Segitiga extends BangunDatar
{	
	int alas, tinggi;
	
	Segitiga(int alas, int tinggi)
	{
		this.alas = alas;
		this.tinggi = tinggi;
	}
	
	@Override
	public float luas()
	{
		return this.alas * this.tinggi / 2;
	
	}
	
	@Override
	public float keliling()
	{
		return this.alas + this.alas + this.alas;
	}
}
