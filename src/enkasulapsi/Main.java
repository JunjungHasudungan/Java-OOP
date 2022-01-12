package enkasulapsi;

class Student
{
	String nama; // default, dapat ditulis dari dalam / luar class dan juga dapat diakses dari dalam / luar clas
	public int tingkatan; // public, dapat ditulis dari dalam / luar class dan juga dapat diakses dari dalam /
	private float nilai; // private, hanya dapat ditulis dari dalam class dan juga hanya dapat diakses dari dalam class
	protected static int index; // protected, 
	
	public Student(String nama, int tingkatan, float nilai)
	{
		this.nama = nama;
		this.tingkatan = tingkatan;
		this.nilai = nilai;
		this.index = 1;
	}
	
//	mengunakan access public
	public String nama()
	{
		return this.nama;
	}
	
//	menggunakan access default pada method
	void display()
	{
		System.out.println("No " + this.index++);
		System.out.println("Nama \t\t : " + this.nama());
		System.out.println("Tingkat \t : " + this.tingkatan());
		System.out.println("Nilai \t\t : " + this.nilai());
		System.out.println("");
	}
	
//	menggunakan access default pada method	
	protected int tingkatan()
	{
		return this.tingkatan;
	}

//	menggunakan access private pada method
	private float nilai()
	{
		return this.nilai;
	}
}

public class Main {

	public static void main(String[] args) {

		Student student1 = new Student("Rendi", 2, 80);
		Student student2 = new Student("Ranto", 1, 75);
		System.out.println("\t Data diri siswa ");
		student1.display();
		student2.display();
	}

}
