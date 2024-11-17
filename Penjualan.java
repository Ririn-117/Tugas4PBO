// Subclass (Child Class) - Menunjukkan INHERITANCE
class Penjualan extends Barang {
    // Properti tambahan untuk Penjualan
    private final String noFaktur;  // Properti baru di subclass
    private final int jumlahBeli;
    private final double total;

    // Constructor Penjualan
    public Penjualan(String noFaktur, String kodeBarang, String namaBarang, double hargaBarang, int jumlahBeli) {
        // Memanggil constructor dari parent class menggunakan `super`
        super(kodeBarang, namaBarang, hargaBarang);
        this.noFaktur = noFaktur;  // Inisialisasi properti subclass
        this.jumlahBeli = jumlahBeli;
        this.total = calculateTotal();  // Menghitung total langsung
    }

    // Method untuk menghitung total
    private double calculateTotal() {
        return hargaBarang * jumlahBeli;  // Menggunakan properti parent class
    }

    // Method untuk menampilkan data penjualan
    public void displayPenjualan() {
        System.out.println("\n--- Detail Penjualan ---");
        System.out.println("No Faktur: " + noFaktur);
        displayBarang(); // Memanggil method dari parent class (Inheritance)
        System.out.println("Jumlah Beli: " + jumlahBeli);
        System.out.println("Total: Rp " + total);
    }
}

// Custom Exception
class InvalidInputException extends Exception { // Menunjukkan CUSTOM EXCEPTION
    public InvalidInputException(String message) {
        super(message); // Mengirim pesan ke parent class Exception
    }
}