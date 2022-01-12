package polimorphism;

public class Lingkaran extends BangunDatar
{
	private int jari_jari;
	
	Lingkaran(int jari_jari)
	{
		this.jari_jari = jari_jari;
	}
	
	@Override
	public float luas()
	{
		return (float) (Math.PI * jari_jari * jari_jari);
	}
	
	@Override
	public float keliling()
	{
		return (float)(2 * Math.PI * jari_jari);
	}
}
