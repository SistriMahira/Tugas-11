import java.util.Scanner;
// Driver Class
public class DriverClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan No. Faktur: ");
        String noFaktur = scanner.next();
        System.out.print("Masukkan Nama Pelanggan: ");
        String namaPelanggan = scanner.next();
        System.out.print("Masukkan Nama Barang: ");
        String namaBarang = scanner.next();
        System.out.print("Masukkan Harga Barang: ");
        double hargaBarang = scanner.nextDouble();
        System.out.print("Masukkan Jumlah Barang: ");
        int jumlahBarang = scanner.nextInt();

        // Membuat objek Barang
        Barang barang = new Barang(namaBarang, hargaBarang, jumlahBarang);

        // Membuat objek Faktur
        Faktur faktur = new Faktur(noFaktur, namaPelanggan, barang);

        // Menampilkan informasi faktur
        faktur.tampilkanInfoFaktur();

        scanner.close();
}
    }
    