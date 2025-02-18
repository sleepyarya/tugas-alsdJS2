public class Dosen03 {
    String idDosen;
    String nama;
    boolean statusAktif;
    int thnGabung;
    String bidangAhli;

    public Dosen03() {

    }

    public Dosen03(String id, String nm, boolean st, int thngbng, String bdg) {
        idDosen = id;
        nama = nm;
        statusAktif = st;
        thnGabung = thngbng;
        bidangAhli = bdg;
    }

    void tampilkanInformasi() {

        System.out.println("ID Dosen     : " + idDosen);
        System.out.println("Nama         : " + nama);
        System.out.println("Status Aktif : " + statusAktif);
        System.out.println("Tahun Gabung : " + thnGabung);
        System.out.println("Bidang Ahli  : " + bidangAhli);
    }

    void setStatusAktif(boolean statusAktif) {
        this.statusAktif = statusAktif;
        System.out.println("Status berhasil diubah menjadi: " + (statusAktif ? "Aktif" : "Tidak Aktif"));
    }

    int hitungMasaKerja(int thnSkrg) {
        return thnSkrg - thnGabung;
    }

    void ubahKeahlian(String bidang) {
        bidangAhli = bidang;
    }
}
