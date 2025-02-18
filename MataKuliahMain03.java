public class MataKuliahMain03 {
    public static void main(String[] args) {
        MataKuliah03 mk1 = new MataKuliah03();
        mk1.nama = "Basis Data";
        mk1.kodeMK = "BD2025";
        mk1.sks = 2;
        mk1.jumlahJam = 5;

        System.out.println("=====Infromasi Mata Kuliah=====");
        mk1.tampilkanInformasi();
        mk1.ubahSKS(4);
        mk1.tambahJam(5);
        mk1.kurangiJam(4);
        mk1.kurangiJam(10);
        mk1.tampilkanInformasi();

        System.out.println("========================");
        MataKuliah03 mk2 = new MataKuliah03("Agama", "AG2025", 2, 10);
        mk2.tampilkanInformasi();
    }
}
