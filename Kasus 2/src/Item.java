/**
 * 
 * <h1>Item</h1>
 * Program Item sebagai class bagi
 * objek yang akan dibuat di class UpinIpin
 * 
 * @author Aini Nurul Azizah
 * @since 2022-02-24
 *
 */

public class Item {
	private String name;	//Deklarasi name
	
	/**
	 * Private method yang mengisi nilai name sebagai "Ipin"
	 * Ini yang harus tampil saat program dijalankan
	 */
	private void Item() {
		name = "Ipin";
	}
	
	/**
	 * Public method yang dapat diakses oleh class UpinIpin
	 */
	public Item(String name) {
		this.Item();					//Memanggil private method Item
		System.out.println(this.name);	//Menampilkan name dari private method Item
										//bukan dari parameter name
	}
}

