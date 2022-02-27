/**
 * <h1>Barang</h1>
 * Program Barang sebagai class bagi objek
 * yg akan dibuat di class Inventori
 * 
 * @author Aini Nurul Azizah
 * @since 2022-02-24
 */

public class Barang {
	String kode_barang;
	String nama_barang;
	private int stok;		//stok dibuat private sbg enkapsulasi
	
	/**
	 * Getter untuk mengakses nilai stok
	 */
	public int getStok() {
		return this.stok;
	}
	
	/**
	 * Setter untuk melakukan penambahan stok
	 */
	public void setStok(int penambahan) {
		stok += penambahan;
	}
	
	/**
	 * Constructor
	 * @return
	 */
	public Barang(String kode, String nama, int stk) { 
		kode_barang = kode;
		nama_barang = nama; 
		stok = stk;
	}
}

