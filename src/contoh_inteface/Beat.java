package contoh_inteface;

public class Beat implements Kendaraan
{
	public int speed;
	private boolean startMesin; 
	
	public Beat()
	{
//		nilai kecepatan default
		this.speed = 50;
	}
	
	@Override // override function yang ada pada interface
	public void engineOn()
	{
		startMesin = true;
		
		System.out.println("BREM..");
		System.out.println("Mesin Motor beat  hidup");
	}
	
	@Override
	public void engineOff()
	{
		startMesin = false;
		
		System.out.println("Mesin sekarang mati");
	}
	
	@Override
	public void speedUp()
	{
		if(startMesin) //	jika kondisi mesin ?
		{
			if(this.speed == maxSpeed)
			{
				System.out.println("Kecepatan MAX");
				System.out.println("Kecepatan sudah " + this.getSpeed());
			}else {
				this.speed += 10; // kecepatan default akan ditambah 10
				System.out.println("Kecepatan sekarang : " + this.getSpeed()); // menampilkan kecepatan setelah penambahan
			}
		}else {
			startMesin = false;
			System.out.println("Hidupkan mesin terlebih dahulu..");
		}
	}
	
	@Override
	public void speedDown()
	{
		if(startMesin == true)  // jika kondisi mesin ?
		{
			if(this.speed == minSpeed) // 
			{
				System.out.println("Kecepatan MIN");
			}else
			{
				this.speed -= 10; // kecepatan default akan dikurang 10
				System.out.println("kecepatan sekarang  : " + this.getSpeed()); // menampilkna kcepatan setelah penambahan
			}
		}
//		kondisi mesin mati
		else
		{
			startMesin = false;
			
			System.out.println("Kondisi mesin mati");
		}
	}
	
	public int getSpeed()
	{
		return this.speed;
	}
}
