import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Menggunakan try-with-resources untuk memastikan scanner ditutup otomatis
        try (Scanner scanner = new Scanner(System.in)) {
            // Input dan logika program
            System.out.print("Masukkan No Faktur: ");
            String noFaktur = scanner.nextLine();
        
            System.out.print("Masukkan Kode Barang: ");
            String kodeBarang = scanner.nextLine();
        
            System.out.print("Masukkan Nama Barang: ");
            String namaBarang = scanner.nextLine();
        
            System.out.print("Masukkan Harga Barang: ");
            double hargaBarang = scanner.nextDouble();
            // Exception Handling - Memastikan harga barang valid
            if (hargaBarang <= 0) {
                throw new InvalidInputException("Harga barang harus lebih dari 0!");
            }
        
            System.out.print("Masukkan Jumlah Beli: ");
            int jumlahBeli = scanner.nextInt();
            // Exception Handling - Memastikan jumlah beli valid
            if (jumlahBeli <= 0) {
                throw new InvalidInputException("Jumlah beli harus lebih dari 0!");
            }
        
            // Membuat objek Penjualan
            Penjualan penjualan = new Penjualan(noFaktur, kodeBarang, namaBarang, hargaBarang, jumlahBeli);
            penjualan.displayPenjualan(); // Menampilkan data penjualan
        } catch (InvalidInputException e) { 
            // Menangkap custom exception
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            // Menangkap exception umum lainnya (contoh: kesalahan dalam input)
            System.out.println("Error: Harap masukkan data yang sesuai!");
        } finally {
            // Blok ini selalu dijalankan, terlepas ada atau tidaknya exception
            System.out.println("Selesai!");
        }
    }
}