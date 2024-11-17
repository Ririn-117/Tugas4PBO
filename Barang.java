// Parent class
class Barang {
    // Properti Barang
    protected String kodeBarang;  // Properti yang bisa diakses oleh subclass
    protected String namaBarang;
    protected double hargaBarang;

    // Constructor Barang
    public Barang(String kodeBarang, String namaBarang, double hargaBarang) {
        this.kodeBarang = kodeBarang;
        this.namaBarang = namaBarang;
        this.hargaBarang = hargaBarang;
    }

    // Method untuk menampilkan informasi barang
    public void displayBarang() {
        System.out.println("Kode Barang: " + kodeBarang);
        System.out.println("Nama Barang: " + namaBarang);
        System.out.println("Harga Barang: Rp " + hargaBarang);
    }
}