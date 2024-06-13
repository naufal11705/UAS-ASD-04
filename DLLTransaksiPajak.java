package UAS;

public class DLLTransaksiPajak {
    TransaksiPajak head;
    int size;

    public DLLTransaksiPajak() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(int kode, long nominalBayar, long denda, int bulanBayar, Kendaraan kendaraan) {
        if (isEmpty()) {
            head = new TransaksiPajak(kode, nominalBayar, denda, bulanBayar, kendaraan, null, null);
        } else {
            TransaksiPajak newNode = new TransaksiPajak(kode, nominalBayar, denda, bulanBayar, kendaraan, null, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void printPajak(String jenis, int cc) {
        int pajak;
        if (jenis.equals("motor")){
            if(cc > 100) {
                pajak = 100000;
            } else if (cc <= 100 && cc >= 250) {
                pajak = 250000;      
            } else {
                pajak = 500000;
            }
        } else {
            if(cc > 1000) {
                pajak = 750000;
            } else if (cc <= 1000 && cc >= 2500) {
                pajak = 1000000;      
            } else {
                pajak = 1500000;
            }
        }
    }
    
}
