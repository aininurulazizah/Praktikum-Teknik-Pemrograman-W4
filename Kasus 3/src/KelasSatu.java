/**
 * <h1>KelasSatu</h1>
 * Program Class KelasSatu
 * Berisi beberapa jenis program yang mana ketika
 * ada pemanggilan class ini untuk membuat objek baru
 * akan dijalankan dengan urutan tertentu
 * 
 * @author Aini Nurul Azizah
 * @since 2022-02-25
 */
class KelasSatu {
	{
		System.out.println(11);		//Ketiga
	}
	static
	{
		System.out.println(2);		//Kedua
	}
	public KelasSatu(int i)
	{
		System.out.println(3);		//Keenam
	}
	public KelasSatu()
	{
		System.out.println(4);		//Keempat
	}
}

