package UAS;
import java.util.Scanner;

public class UASMain04 {
    public static void main(String[] args) {
        DLLKendaraan kendaraan = new DLLKendaraan();
        DLLTransaksiPajak transaksi = new DLLTransaksiPajak();
        Scanner scInt = new Scanner(System.in);
        Scanner scString = new Scanner(System.in);


        kendaraan.addFirst("S 4567 YV", "Basko", "Mobil", 2000, 2012, 4);
        kendaraan.addFirst("N 4511 VS", "Arta", "Mobil", 2500, 2015, 3);
        kendaraan.addFirst("AB 4321 A", "Wisnu", "Motor", 125, 2010, 2);
        kendaraan.addFirst("B 1234 AG", "Sisa", "Motor", 150, 2020, 1);

        do {

            System.out.println("Menu");
            System.out.println("1. Daftar Kendaraan");
            System.out.println("2. Bayar Pajak");
            System.out.println("3. Tampilkan seluruh transaksi");
            System.out.println("4. Urutkan transaksi berdasarkan nama pemilik");
            System.out.println("5. Keluar");
            System.out.print("Pilih(1-5): ");
            int menu = scInt.nextInt();

            System.out.println("-----------------------");

            
            switch (menu) {
                case 1:
                    kendaraan.print();
                    break;

                case 2:
                    System.out.print("Masukkan Data Pembayaran: ");
                    String noTNKB = scString.nextLine();
                    if(kendaraan.findTNKB(noTNKB)) {
                        System.out.print("Bulan Bayar: ");
                        int bulanBayar;
                    } else {
                        System.out.println("No. TNKB tidak ditemukan!");
                    }
                    break;

                case 3:
                    break;

                case 4:
                    break;

                case 5:
                    System.exit(0);
                    break;
            
                default:
                    break;
            }
        } while (true);

    }
}
