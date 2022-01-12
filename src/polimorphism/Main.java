package polimorphism;
import java.util.Scanner;

public class Main 
{
	public static void main(String[] args) 
	{
			
		Segitiga segitiga = new Segitiga(6,7);
		Jajar_Genjang jajarGenjang = new Jajar_Genjang(6, 7);
		Lingkaran lingkaran = new Lingkaran(3);
		
		System.out.println("\t === Polimorpishm === ");
		System.out.println("Luas Lingkaran \t\t: " + lingkaran.luas());
		System.out.println("Keliling Lingkaran \t : " + lingkaran.keliling());
		System.out.println();
		System.out.println("Keliling jajar genjang \t : " + jajarGenjang.keliling());
		System.out.println("Luas jajar genjang \t : " + jajarGenjang.luas());
		System.out.println();
		System.out.println("Keliling segitiga \t : " + segitiga.keliling());
		System.out.println("Luas segitiga \t\t : " + segitiga.luas());
	}
}
