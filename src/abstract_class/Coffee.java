package abstract_class;

public class Coffee extends Product
{
//	data members / properthies / attributes
	public String nama;
	public String tipe_rasa;
	private int harga;
	public static int index;
	
//	constructor
	
	public Coffee(String nama, int harga, String tipe_rasa)
	{
		this.nama = nama;
		this.tipe_rasa = tipe_rasa;
		this.harga = harga;
		this.index = 1;
	}
	
	@Override
	public String getNama()
	{
		return this.nama;
	}
	
	@Override
	public int getHarga()
	{
		return this.harga;
	}
	
	@Override
	String typeTaste()
	{
		return this.tipe_rasa;
	}
	
	@Override
	public void infoProduct()
	{
		System.out.println("No " + index++);
		System.out.println("Nama  Barang \t :" + this.getNama());
		System.out.println("Harga Barang \t :" + this.getHarga());
		System.out.println("Tipe Rasa \t : " + this.typeTaste());
		System.out.println();
	}
}
