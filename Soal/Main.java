// Kelas POJO untuk ATK (kode A dan B)
package Soal;

import java.util.ArrayList;
import java.util.Collections;

class ATK implements Comparable<ATK> {
    private String kodeBarang;
    private String jenisBarang;
    private String namaBarang;
    private int stok;

    public ATK(String kodeBarang, String jenisBarang, String namaBarang, int stok) {
        this.kodeBarang = kodeBarang;
        this.jenisBarang = jenisBarang;
        this.namaBarang = namaBarang;
        this.stok = stok;
    }

    // Getter dan setter
    // ...

    @Override
    public int compareTo(ATK other) {
        return this.kodeBarang.compareTo(other.kodeBarang);
    }

    @Override
    public String toString() {
        return "Kode Barang: " + kodeBarang + ", Jenis Barang: " + jenisBarang + ", Nama Barang: " + namaBarang + ", Stok: " + stok;
    }
}

// Kelas POJO untuk Bag (kode C)
class Bag implements Comparable<Bag> {
    private String kodeBarang;
    private String jenisBarang;
    private String namaBarang;
    private int stok;

    public Bag(String kodeBarang, String jenisBarang, String namaBarang, int stok) {
        this.kodeBarang = kodeBarang;
        this.jenisBarang = jenisBarang;
        this.namaBarang = namaBarang;
        this.stok = stok;
    }

    // Getter dan setter
    // ...

    @Override
    public int compareTo(Bag other) {
        return this.kodeBarang.compareTo(other.kodeBarang);
    }

    @Override
    public String toString() {
        return "Kode Barang: " + kodeBarang + ", Jenis Barang: " + jenisBarang + ", Nama Barang: " + namaBarang + ", Stok: " + stok;
    }
}

public class Main {
    public static void main(String[] args) {
        // Membuat objek untuk ATK (kode A dan B)
        ATK atk1 = new ATK("A003", "Pensil", "Faber Castell 2B", 100);
        ATK atk2 = new ATK("A001", "Pulpen", "Snowman Board Marker hitam", 50);
        ATK atk3 = new ATK("A002", "Pensil", "Faber Castell 2H", 80);

        // Membuat objek untuk Bag (kode C)
        Bag bag1 = new Bag("C002", "Tas", "Tas Ransel Motif Galaxy", 20);
        Bag bag2 = new Bag("C001", "Tempat Pensil", "Pencil Case Motif Kartun", 30);

        // Membandingkan objek ATK
        int resultATK1andATK2 = atk1.compareTo(atk2);
        System.out.println("Hasil perbandingan ATK 1 dan ATK 2: " + resultATK1andATK2); // Output: Hasil perbandingan ATK 1 dan ATK 2: 1

        // Membandingkan objek Bag
        int resultBag1andBag2 = bag1.compareTo(bag2);
        System.out.println("Hasil perbandingan Bag 1 dan Bag 2: " + resultBag1andBag2); // Output: Hasil perbandingan Bag 1 dan Bag 2: 1

        // Menyimpan data ATK dalam ArrayList
        ArrayList<ATK> atkList = new ArrayList<>();
        atkList.add(atk1);
        atkList.add(atk2);
        atkList.add(atk3);

        // Menyimpan data Bag dalam ArrayList
        ArrayList<Bag> bagList = new ArrayList<>();
        bagList.add(bag1);
        bagList.add(bag2);

        Collections.sort(atkList);

        // Mengurutkan data Bag berdasarkan kode barang
        Collections.sort(bagList);

        // Menampilkan data ATK setelah diurutkan
        System.out.println("Data ATK setelah diurutkan berdasarkan kode barang:");
        for (ATK atk : atkList) {
            System.out.println(atk);
        }

        System.out.println();

        // Menampilkan data Bag setelah diurutkan
        System.out.println("Data Bag setelah diurutkan berdasarkan kode barang:");
        for (Bag bag : bagList) {
            System.out.println(bag);
        }
    }
}
