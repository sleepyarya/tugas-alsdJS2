public class MataKuliah03 {
    String nama;
    String kodeMK;
    int sks;
    int jumlahJam;

    // Konstruktor default
    public MataKuliah03() {
    }

    // Konstruktor dengan parameter
    public MataKuliah03(String nm, String kd, int sks, int jmlJ) {
        nama = nm;
        kodeMK = kd;
        this.sks = sks;
        jumlahJam = jmlJ;
    }

    // Menampilkan informasi mata kuliah
    void tampilkanInformasi() {
        System.out.println("Nama Mata Kuliah : " + nama);
        System.out.println("Kode Mata Kuliah : " + kodeMK);
        System.out.println("SKS             : " + sks);
        System.out.println("Jumlah Jam      : " + jumlahJam);
    }

    // Mengubah jumlah SKS
    void ubahSKS(int sksBaru) {
        sks = sksBaru;
    }

    // Menambah jumlah jam
    void tambahJam(int jam) {
        jumlahJam += jam;
        System.out.println("Jumlah jam setelah ditambah: " + jumlahJam);
    }

    // Mengurangi jumlah jam dengan pengecekan
    void kurangiJam(int jam) {
        if (jam > jumlahJam) {
            System.out.println("Pengurangan tidak dapat dilakukan! Jumlah jam tidak mencukupi.");
        } else {
            jumlahJam -= jam;
            System.out.println("Jumlah jam setelah dikurangi: " + jumlahJam);
        }
    }
}