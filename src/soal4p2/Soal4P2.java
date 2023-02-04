package soal4p2;
import java.util.Scanner;

/**
 *
 * @author Muhamad Mathar Rizqi
 */
public class Soal4P2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); 
        //membuat agar user bisa memasukan jumlah penjualan bulan ini
        
        int jumlahPenjualan = scan.nextInt();
        //Mendeklarasikan dan inisialisasi variable jumlahPenjualan untuk menyimpan jumlah penjualan yang diinput oleh user.
        
        //deklarasi sesuai kasus
        int gajiPokok = 500000;
        int hargaSatuan = 50000;
        int bonusSatuan = (int) (hargaSatuan * 0.1);
        int bonusPenjualan = 0;
        int denda = 0;
        //selection statement berdasarkan kasus
        if (jumlahPenjualan >= 40) {
          bonusPenjualan = (int) (hargaSatuan * jumlahPenjualan * 0.25);
        }
        if (jumlahPenjualan >= 80) {
          bonusPenjualan = (int) (hargaSatuan * jumlahPenjualan * 0.35);
        }
        if (jumlahPenjualan < 15) {
          denda = (int) (gajiPokok * 0.15);
        }
        //penjumalahan hasil gaji
        int gaji = gajiPokok + bonusSatuan * jumlahPenjualan + bonusPenjualan - denda;
        //print gaji ke layar
        System.out.println(gaji);
    }
}