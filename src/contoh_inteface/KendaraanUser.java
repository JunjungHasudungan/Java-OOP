package contoh_inteface;

public class KendaraanUser 	
{
//	mendeklarasikan nama interface dan object 
	private Kendaraan kendaraan;
	
//	membuat constructor dengan konsep Depedency Injection interface / abstract class
	public KendaraanUser(Kendaraan kendaraan)
	{
		this.kendaraan = kendaraan;
	}
	
//	membuat function baru dengan mengawali memanggil object dan memanggil function yang sudah diinjection
	void turnOnKendaraan()
	{
		this.kendaraan.engineOn();
	}
	
	void turnOfKendaraan()
	{
		this.kendaraan.engineOff();
	}
	
	void tambahKecepatan()
	{
		this.kendaraan.speedUp();
	}
	
	void kurangiKecepatan()
	{
		this.kendaraan.speedDown();
	}
	
}
