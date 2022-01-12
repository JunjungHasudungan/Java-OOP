package Dasar;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int amount;
		
		Scanner scanner = new Scanner(System.in);
		amount = scanner.nextInt();
		
//		buat array int sebagai penampung inputan jumlah
		int arr[] = new int[amount];
		
//		tampilkan sugesti jumlah yang akan ditunjukkan
		for(int i = 0; i < amount; i++)
		{
			arr[amount] = scanner.nextInt();
		}
	}

}
