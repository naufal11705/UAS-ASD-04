package UAS;

public class TransaksiPajak {

    TransaksiPajak prev, next;
    int kode, bulanBayar;
    long nominalBayar, denda;
    Kendaraan kendaraan;

    TransaksiPajak(int kode, long nominalBayar, long denda, int bulanBayar, Kendaraan kendaraan, TransaksiPajak prev, TransaksiPajak next) {
        this.kode = kode;
        this.nominalBayar = nominalBayar;
        this.denda = denda;
        this.bulanBayar = bulanBayar;
        this.prev=prev;
        this.next=next;
    }

}
