package UAS;

public class Kendaraan {

    Kendaraan prev, next;
    String noTNKB, nama, jenis;
    int cc, tahun, bulanHarusBayar;

    Kendaraan(String noTNKB, String nama, String jenis, int cc, int tahun, int bulanHarusBayar, Kendaraan prev, Kendaraan next) {
        this.noTNKB = noTNKB;
        this.nama = nama;
        this.jenis = jenis;
        this.cc = cc;
        this.bulanHarusBayar = bulanHarusBayar;
        this.prev=prev;
        this.next=next;
    }

}
