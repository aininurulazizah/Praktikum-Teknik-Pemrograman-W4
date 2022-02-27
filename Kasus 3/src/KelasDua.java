/**
 * <h1>KelasDua</h1>
 * Program Class KelasDua
 * Memanggil class KelasSatu untuk membuat objek baru
 * 
 * @author Aini Nurul Azizah
 * @since 2022-02-25
 */

class KelasDua {
	{
		System.out.println(5);
	}
	public static void main(String[] args)
	{
		System.out.println(6);				//Pertama
		KelasSatu satu = new KelasSatu(); 
		KelasSatu dua = new KelasSatu(10);
	}

}

