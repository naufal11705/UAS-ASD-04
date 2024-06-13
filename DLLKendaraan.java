package UAS;

public class DLLKendaraan {
    Kendaraan head;
    int size;

    public DLLKendaraan() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(String noTNKB, String nama, String jenis, int cc, int tahun, int bulanHarusBayar) {
        if (isEmpty()) {
            head = new Kendaraan(noTNKB, nama, jenis, cc, tahun, bulanHarusBayar, null, null);
        } else {
            Kendaraan newNode = new Kendaraan(noTNKB, nama, jenis, cc, tahun, bulanHarusBayar, null, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void print() {
        if (!isEmpty()) {
            Kendaraan tmp = head;
            while (tmp != null) {
                System.out.println(tmp.noTNKB + "\t" + tmp.nama + "\t" + tmp.jenis + "\t" + tmp.cc + "\t" + tmp.tahun + "\t" + tmp.bulanHarusBayar);
                tmp = tmp.next;
            }
            System.out.println("\nberhasil diisi");
        } else {
            System.out.println("Linked Lists Kosong");
        }
    }

    boolean findTNKB(String noTNKB) {
        boolean result = false;
        Kendaraan current = head;
        while (true) {
            if (current == null) {
                break;
            } else if(current.noTNKB != noTNKB) {
                current = current.next;
                System.out.println("error?");
            } else {
               result = true;
               break;
            }
        }
        return result;
    }
    
}
