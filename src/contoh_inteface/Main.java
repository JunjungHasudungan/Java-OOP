package contoh_inteface;
import java.util.Scanner;
public class Main 
{
	public static void main(String[] args) 
	{
//		membuat object nama jenis kendaraan
		Beat beat = new Beat();
		
//		membuat object kendaraan user
		KendaraanUser user1 = new KendaraanUser(beat);
		user1.turnOnKendaraan();
		user1.turnOfKendaraan();
	}
}
