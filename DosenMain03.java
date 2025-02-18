public class DosenMain03 {
    public static void main(String[] args) {
        Dosen03 ds1 = new Dosen03();

        ds1.idDosen = "DSKR20";
        ds1.nama = "Kurniawan";
        ds1.thnGabung = 2020;
        ds1.bidangAhli = "Matematika";
        ds1.tampilkanInformasi();
        ds1.setStatusAktif(false);
        System.out.println("Masa Kerja : " + ds1.hitungMasaKerja(2025) + " tahun");
        ds1.ubahKeahlian("Pancasila");
        System.out.println("===Setelah update===");
        ds1.tampilkanInformasi();
        System.out.println("Masa Kerja : " + ds1.hitungMasaKerja(2025) + " tahun");

        // berparameter
        System.out.println("==============================");
        Dosen03 ds2 = new Dosen03("ANDI19", "Andik", true, 2019, "KTI");
        ds2.tampilkanInformasi();
        System.out.println("Masa Kerja : " + ds2.hitungMasaKerja(2025) + " tahun");
    }

}