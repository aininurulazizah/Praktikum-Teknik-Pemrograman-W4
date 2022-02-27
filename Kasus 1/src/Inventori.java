/**
 * 
 * <h1>Inventori</h1>
 * Program Inventori untuk melakukan instansi barang,
 * melakukan penambahan stok barang, dan menampilkan
 * data barang yang dikerjakan dalam tiap method,
 * yang objeknya dibuat dari class Barang
 * 
 * @author Aini Nurul Azizah
 * @since 2022-02-24
 *
 */

public class Inventori {
	Barang[] barangs;	//Deklarasi array barangs bertipe Barang 
	
	/**
	 * Method untuk instasi objek baru
	 */
	void initBarang() {
		barangs = new Barang[2];
		barangs[0] = new Barang("001", "Baju", 10); 
		barangs[1] = new Barang("002", "Celana", 20);
	}
	
	/**
	 * Method menampilkan data barang
	 */
	void showBarang() {
		System.out.println(barangs[0].nama_barang + "(" + barangs[0].getStok() + ")"); 
		System.out.println(barangs[1].nama_barang + "(" + barangs[1].getStok() + ")");
	}
	
	/**
	 * Method melakukan penambahan stok
	 */
	void pengadaan() {
		initBarang();			//memanggil method instansi
		barangs[0].setStok(20);	//melakukan penambahan stok sebanyak 20 melalui setter setStok
		barangs[1].setStok(25);	//melakukan penambahan stok sebanyak 25 melalui setter setStok
		showBarang();
	}
	
	/**
	 * Main program
	 */
	public static void main(String[] args) { 
		Inventori beli = new Inventori();	//menambah objek baru
		beli.pengadaan();					//memanggil method pengadaan
	}
	
}


