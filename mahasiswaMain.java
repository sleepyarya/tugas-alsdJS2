public class mahasiswaMain {
    public static void main(String[] args) {
        Mahasiswa03 mahasiswa1 = new Mahasiswa03();

        mahasiswa1.nama = "Arya Ramadhan";
        mahasiswa1.nim = "244107020195";
        mahasiswa1.ipk = 3.12;
        mahasiswa1.kelas = "TI 1E";

        System.out.println("======INFORMASI AWAL======");
        mahasiswa1.tampilkanInformasi();
        System.out.println("Nilai Kinejra : " + mahasiswa1.nilaiKinerja());

        mahasiswa1.ubahKelas("TI 1F");
        mahasiswa1.ubahIPK(3.95);

        System.out.println("======INFORMASI BARU======");
        mahasiswa1.tampilkanInformasi();
        System.out.println("Nilai Kinejra : " + mahasiswa1.nilaiKinerja());

        // mahasiswa2 berparameter
        System.out.println("=====Mahasiswa Lain=====");
        Mahasiswa03 mahasiswa2 = new Mahasiswa03("Adn Syahputra", "244107020195", 3.44, "TI 1A");
        mahasiswa2.ubahIPK(3.98);
        mahasiswa2.tampilkanInformasi();

        // mmahasiswa objek baru berparameter
        System.out.println("=====Mahasiswa Objek dengan Nama");
        Mahasiswa03 mahasiswa3 = new Mahasiswa03("Nirvana Esa Larasati", "244907020193", 3.7, "SIB 1F");
        mahasiswa3.tampilkanInformasi();
    }
}
